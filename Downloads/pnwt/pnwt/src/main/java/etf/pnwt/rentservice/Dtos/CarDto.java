package etf.pnwt.rentservice.Dtos;

public class CarDto {
    private Integer id;
    private Integer CarId;
    private Integer CustomerId;
    private Boolean IsReserved;

    public void setId(Integer Id){
        id = Id;
      }
    public void setCarId(Integer carId){
      CarId = carId;
    }
    public void setCustomerId(Integer customerId){
        CustomerId = customerId;
      }

      public void setIsReserved(boolean isReserved)
      {
          IsReserved = isReserved;
      }

      public Integer getCarId()
      {
          return CarId;
      }
    
      public Integer getCustomerId()
      {
          return CustomerId;
      }

      public Boolean getIsReserved()
      {
          return IsReserved;
      }

      public Integer getId()
      {
          return id;
      }

      public CarDto()
      {

      }

      public CarDto (Integer Id, Integer carId, Integer customerId, Boolean isReserved)
      {
          this.id = Id;
          this.CarId = carId;
          this.CustomerId = customerId;
          this.IsReserved = isReserved;
      }
}
