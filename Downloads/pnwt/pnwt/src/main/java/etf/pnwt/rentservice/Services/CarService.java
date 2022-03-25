package etf.pnwt.rentservice.Services;



import etf.pnwt.rentservice.ErrorHandling.InvalidRequestException;
import etf.pnwt.rentservice.ErrorHandling.ObjectNotFoundException;
import etf.pnwt.rentservice.Models.Car;
import etf.pnwt.rentservice.Repository.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    //final - can't be extended
    private final CarRepository _CarRepository;
    private final ValidationService _validationService;

    public CarService(CarRepository CarRepository, ValidationService _validationService) {
        this._CarRepository = CarRepository;
        this._validationService = _validationService;
    }

    public ResponseEntity<List<Car>> findAllCars() {
        return new ResponseEntity(_CarRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<Car>> findAllReservedCars() {
        return new ResponseEntity(_CarRepository.findByIsReservedTrue(), HttpStatus.OK);
    }

    public ResponseEntity<Car> findCarById(Integer id) throws InvalidRequestException, ObjectNotFoundException {
        this._validationService.validateId(id);

        Optional<Car> Car = _CarRepository.findById(id);
        if(Car.isPresent()){
            return new ResponseEntity(Car.get(), HttpStatus.OK);
        }
        else{
            throw new ObjectNotFoundException("There is no car with the ID "+id);
        }
    }

    public ResponseEntity<Car> saveCar(Car Car) throws InvalidRequestException {
        try{
                       
            this._validationService.validateCar(Car);
            Car newCar = this._CarRepository.save(Car);
            return new ResponseEntity(newCar, HttpStatus.OK);
        }
        catch(ObjectNotFoundException ex){
            return new ResponseEntity("Fail to save car. Message: " + ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    public ResponseEntity<Car> reserveCar(Integer id) throws InvalidRequestException, ObjectNotFoundException {
        try
        {
            this._validationService.validateId(id);

            Car Car = this.findCarById(id).getBody();

            Car.setIsReserved(true);
            Car updatedCar = this._CarRepository.save(Car);
            return new ResponseEntity(updatedCar, HttpStatus.OK);
        }
        catch(Exception ex){
            return new ResponseEntity("Fail to update car. Message: " + ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    public ResponseEntity deleteCar(Integer id) throws InvalidRequestException, ObjectNotFoundException {

        try{
            this._validationService.validateId(id);

            this.findCarById(id);

            this._CarRepository.deleteById(id);
            return new ResponseEntity("Car successfully deleted.", HttpStatus.OK);
        }
        catch(Exception ex){
            return new ResponseEntity("Fail to delete car. Message: " + ex.getMessage(), HttpStatus.CONFLICT);
        }
    }
}