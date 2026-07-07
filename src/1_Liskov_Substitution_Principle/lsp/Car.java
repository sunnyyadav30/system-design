package lsp;

public class Car implements EngineVehicle {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling.");
    }
}