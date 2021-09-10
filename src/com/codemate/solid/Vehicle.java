
package com.codemate.solid;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    void startEngine() {

    }

}

class Car extends Vehicle {

    @Override
    public void startEngine() {

    }
}


class Bycle extends Vehicle {

    @Override
    public void startEngine() {
        try {
            throw new EngineNotFoundExceptin("Engine Missing.");
        } catch (EngineNotFoundExceptin e) {
            e.printStackTrace();
        }
    }

    public class EngineNotFoundExceptin extends Throwable {
        EngineNotFoundExceptin(final String s) {
        }
    }
}

class VehicleMonitor {

    public void startVehiclees() {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        Vehicle car = new Car();
        Vehicle cycle = new Bycle();

        vehicles.add(car);
        vehicles.add(cycle);

        vehicles.forEach(vehicle -> vehicle.startEngine());
    }
}