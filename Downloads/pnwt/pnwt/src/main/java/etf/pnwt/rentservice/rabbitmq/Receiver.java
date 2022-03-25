/*package etf.pnwt.rentservice.rabbitmq;

import etf.pnwt.rentservice.ErrorHandling.InvalidRequestException;
import etf.pnwt.rentservice.ErrorHandling.ObjectNotFoundException;
import etf.pnwt.rentservice.Models.Car;
import etf.pnwt.rentservice.Repository.CarRepository;
import etf.pnwt.rentservice.Services.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import static java.lang.Integer.parseInt;

public class Receiver {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private CarService CarService;
    @Autowired
    private ObjectMapper objectMapper;

    @RabbitHandler
    @RabbitListener(queues = "real-estate-queue")
    public void receive(String message) throws InvalidRequestException, ObjectNotFoundException, JsonProcessingException {
        if(message.contains("customerId")){

            Car newCar = objectMapper.readValue(message, Car.class);
            try{
                CarService.saveCar(newCar);
                System.out.println("Sent message with status: Ok " + newCar);
            }
            catch(Exception ex){
                rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Error " + newCar);
                System.out.println("Sent message with status: Error " + newCar);
            }

        }
        else{
            Integer CarId = Integer.parseInt(message);
            System.out.println("Received message = " + CarId);
            var Car = CarService.findCarById(CarId).getBody();
            try {

                CarService.deleteCar(CarId);

                rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Ok " + CarId);
                System.out.println("Sent message with status: Ok " + CarId);

            }
            catch (ObjectNotFoundException ex) {
                CarService.saveCar(Car);
                rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Error " + CarId);
                System.out.println("Sent message with status: Error " + CarId);
            }
            catch (Exception ex) {
                rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Error " + CarId);
                System.out.println("Sent message with status: Error " + CarId);
            }
        }
    }

    @RabbitHandler
    @RabbitListener(queues = "invoice-queue")
    public void receiveInvoice(String message) throws InvalidRequestException, ObjectNotFoundException, JsonProcessingException {
        Integer CarId = Integer.parseInt(message);
        System.out.println("Received message = " + CarId);

        try {
            Car Car;
            var re = CarService.findCarById(CarId);
            if(re != null){
                Car = re.getBody();
                CarService.reserveCar(Car.getCarId());
            }

            rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Ok " + CarId);
            System.out.println("Sent message with status: Ok " + CarId);

        }
        catch (ObjectNotFoundException ex) {
            rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Error " + CarId);
            System.out.println("Sent message with status: Error " + CarId);
        }
        catch (Exception ex) {
            rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, "Error " + CarId);
            System.out.println("Sent message with status: Error " + CarId);
        }
    }

}
*/