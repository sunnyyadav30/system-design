package lsp;

public class Motorcycle implements EngineVehicle {

    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void refuel() {
        System.out.println("Motorcycle is refueling.");
    }
}