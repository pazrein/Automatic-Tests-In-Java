package mock.car;

public class Car {
    private Engine engine;
    private FuelTank fuelTank;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void start() {
        if (engine.isRunning()) {
            throw new IllegalStateException("Engine already running");
        }
        if (fuelTank.getFuel() == 0) {
            throw new IllegalStateException("Can't start: no fuel");
        }

        engine.start();

        if (!engine.isRunning()) {
            throw new IllegalStateException("Started engine but isn't running");
        }
    }

    public boolean isRunning() {
        return engine.isRunning();
    }
}