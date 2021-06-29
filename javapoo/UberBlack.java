package javapoo;
import java.util.ArrayList;
import java.util.Map;
public class UberBlack extends Car{
    //Map<String, ArrayList<String,Integer>> typeCarAccepted;
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> SeatsMaterial;
    String brand;
    String model;

    public UberBlack(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> SeatsMaterial)
     {
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.SeatsMaterial = SeatsMaterial;        
    

    }
    
}
