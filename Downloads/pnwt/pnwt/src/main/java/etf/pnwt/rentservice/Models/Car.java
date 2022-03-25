package etf.pnwt.rentservice.Models;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
@Entity
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private Integer id;
  
    @JsonProperty("CarId")
 
    private Integer CarId;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("isReserved")
    private boolean isReserved;

    public Car() {
    }

    public Car(Integer CarId, Integer customerId, boolean isReserved) {
        this.CarId = CarId;
        this.customerId = customerId;
        this.isReserved = isReserved;
    }

    public Car(Integer id, Integer CarId, Integer customerId, boolean isReserved) {
        this.id = id;
        this.CarId = CarId;
        this.customerId = customerId;
        this.isReserved = isReserved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer CarId) {
        this.CarId = CarId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", CarId=" + CarId +
                ", customerId=" + customerId +
                ", isReserved=" + isReserved +
                '}';
    }
}