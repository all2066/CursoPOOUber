package javapoo;
class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Uberx uberX = new Uberx("AMQ123",new Account("Andres Herrera", "AND123","email","passw"),"Chevrolet","Sonic");
        //uberX.passenger=4;
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123", "email", "password"));
        uberVan.setPassenger(6);
        /*
        Car car2=new Car("QWE567", new Account("Andrea Herrera", "AND876") );
        car2.passenger=3;
        car2.printDataCar();
        */

    }
}