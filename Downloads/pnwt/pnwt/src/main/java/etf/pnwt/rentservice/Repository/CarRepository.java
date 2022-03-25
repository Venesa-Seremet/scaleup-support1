package  etf.pnwt.rentservice.Repository;
import   etf.pnwt.rentservice.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;



public interface CarRepository extends JpaRepository<Car, Integer> {
    public List<Car> findByIsReservedTrue();
}