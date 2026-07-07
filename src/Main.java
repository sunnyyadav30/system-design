import lsp.*;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bicycle();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        bike.start();
        motorcycle.start();

        System.out.println();

        EngineVehicle engineCar = new Car();
        EngineVehicle engineMotorcycle = new Motorcycle();

        engineCar.refuel();
        engineMotorcycle.refuel();
    }
}