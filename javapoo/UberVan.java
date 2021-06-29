package javapoo;
import java.util.ArrayList;
import java.util.Map;
public class UberVan extends Car{
    //Map<String, ArrayList<String,Integer>> typeCarAccepted;
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> SeatsMaterial;
private Integer passenger;



    String brand;
    String model;

    public UberVan(String license, Account driver)
     {
        super(license,driver);       
       


    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger==6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
    
}