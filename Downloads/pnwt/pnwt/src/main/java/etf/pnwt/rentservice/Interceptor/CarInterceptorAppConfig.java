package etf.pnwt.rentservice.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class CarInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    CarInterceptor CarInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(CarInterceptor);
    }
}
