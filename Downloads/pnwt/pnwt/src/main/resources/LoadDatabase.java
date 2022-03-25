package etf.pnwt.rentservice;


import etf.pnwt.rentservice.Repository.CarRepository;
import etf.pnwt.rentservice.Models.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CarRepository repository) {
        return args -> {
         
           /* log.info("Preloading " + repository.save(new Car (1,1234,12334,false)));
            log.info("Preloading " + repository.save(new Car (2,12324,122334,false)));*/


          Car car = new Car(1,1234,12345,false);
          car = repository.save(car);         
        
        };
    }
}
