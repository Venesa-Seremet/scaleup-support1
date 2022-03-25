package etf.pnwt.rentservice.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import etf.pnwt.grpc.SystemEventsRequest;
import etf.pnwt.grpc.SystemEventsResponse;
import etf.pnwt.grpc.SystemEventsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.sql.Timestamp;

@Component
public class CarInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception exception) throws Exception {

        String action = request.getMethod();
        String resource = request.getRequestURI().split("/")[1];
        String actionResponse = String.valueOf(response.getStatus());
        setAction(action, resource, actionResponse);

    }

    public String setAction(String action, String resource, String actionResponse) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        SystemEventsServiceGrpc.SystemEventsServiceBlockingStub stub =
                SystemEventsServiceGrpc.newBlockingStub(channel);

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        SystemEventsResponse response = stub.getAction(SystemEventsRequest.newBuilder()
                .setTimeStamp(timestamp.toString())
                .setMicroservice("rentservice")
                .setAction(action)
                .setResource(resource)
                .setResponse(actionResponse)
                .build());

        channel.shutdown();

        return response.getResponseMessage();
    }
}
