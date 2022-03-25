package etf.pnwt.rentservice.Controllers;

import etf.pnwt.rentservice.ErrorHandling.InvalidRequestException;
import etf.pnwt.rentservice.ErrorHandling.ObjectNotFoundException;
import etf.pnwt.rentservice.Models.Car;
import etf.pnwt.rentservice.Services.CarService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This means that this class is a Controller
@RequestMapping(path="/Car") // This means URL's start with /demo (after Application path)
public class CarController {

    private CarService _CarService;  

    public CarController(CarService CarService){
        _CarService = CarService;
        
    }
  
    @GetMapping(path="/all")
    ResponseEntity<List<Car>> getAllCars() {
        // This returns a JSON or XML with the Cars
        return _CarService.findAllCars();
    }

    @GetMapping(path="/allReserved")
    ResponseEntity<List<Car>> getAllReservedCars() {
        return _CarService.findAllReservedCars();
    }
  
    @GetMapping("/{id}")
    ResponseEntity<Car> findCarById(@PathVariable(value = "id") Integer id) throws InvalidRequestException, ObjectNotFoundException {
        return _CarService.findCarById(id);
    }

    @PostMapping("/add")
    ResponseEntity<Car> addNewCar(@RequestBody Car Car) throws InvalidRequestException, ObjectNotFoundException {
        return _CarService.saveCar(Car);
    }

    @PutMapping("/reserve/{id}")
    ResponseEntity<Car> reserveCar(@PathVariable(value = "id") Integer id) throws InvalidRequestException, ObjectNotFoundException {
        return _CarService.reserveCar(id);
    }

    @DeleteMapping("delete/{id}")
    ResponseEntity deleteCar(@PathVariable(value = "id") Integer id) throws InvalidRequestException, ObjectNotFoundException {

        return _CarService.deleteCar(id);
    }
}