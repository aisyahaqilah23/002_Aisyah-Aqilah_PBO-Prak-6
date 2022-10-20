public class prak6_no1 {
    public static void main(String[] args) {
        Truck truck_1 = new Truck();
        RiverBarge riverBarge_1 = new RiverBarge();

        System.out.println("=== Truck ===");
        truck_1.getLoad(20);
        truck_1.getMaxLoad(200);
        truck_1.addBox(20);
        truck_1.calcFuelEffieciency(150);
        truck_1.calcTripDistance(30000);
        System.out.println("\n");

        System.out.println("=== River Barge ===");
        riverBarge_1.getLoad(30);
        riverBarge_1.getMaxLoad(500);
        riverBarge_1.addBox(50.5);
        riverBarge_1.calcFuelEffieciency(300);
        riverBarge_1.calcTripDistance(70000);
        System.out.println("\n");

    }
}

class Vehicle{
    double load = 0;
    double max_load = 0;

    void getLoad(double load) {
        System.out.println("Load : " + load);
    }
    void getMaxLoad(double max_load) {
        System.out.println("Max Load : " + max_load);
    };

    void addBox(double weight) {
        System.out.println("Add Box : " + weight);
    };

    public void calcFuelEffieciency(double fuel) {
        System.out.println("Fuel Effieciency : " + fuel);
    }

    void calcTripDistance(double trip) {
        System.out.println("Trip Distance : " + trip);
    }
}

class Truck extends Vehicle {
    public void calcFuelEffieciency(double fuel) {
        System.out.println("Fuel Effieciency : " + fuel);
    }

    void calcTripDistance(double trip) {
        System.out.println("Trip Distance : " + trip);
    }
}

class RiverBarge extends Vehicle {
    public void calcFuelEffieciency(double fuel) {
        System.out.println("Fuel Effieciency : " + fuel);
    }

    void calcTripDistance(double trip) {
        System.out.println("Trip Distance : " + trip);
    }
}