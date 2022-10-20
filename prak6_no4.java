//public class prak6_no4 {
//    public static void main(String[] args) {
//        RiverBarge riverBarge_1 = new RiverBarge();
//
//        System.out.println("=== River Barge ===");
//        riverBarge_1.getLoad(25);
//        riverBarge_1.getMaxLoad(250);
//        riverBarge_1.addBox(40.5);
//        System.out.println(riverBarge_1.dock());
//        System.out.println(riverBarge_1.cruise());
//        System.out.println("\n");
//
//        System.out.println("=== Sea Plane ===");
//        SeaPlane seaPlane = new SeaPlane();
//        System.out.println(seaPlane.dock());
//        System.out.println(seaPlane.cruise());
//        System.out.println("\n");
//
//        System.out.println("=== Airplane ===");
//        Vehicle airplane_1 = new Vehicle();
//        airplane_1.getLoad(20);
//        airplane_1.getMaxLoad(150);
//        airplane_1.addBox(25);
//        airplane_1.calcFuelEffieciency(200);
//        airplane_1.calcTripDistance(30000);
//        System.out.println("\n");
//
//        Flyer airplane = new Airplane();
//        System.out.println(airplane.takeOff());
//        System.out.println(airplane.land());
//        System.out.println(airplane.fly());
//    }
//}
//
//interface Flyer{
//    String takeOff();
//    String land();
//    String fly();
//}
//
//interface Sailer {
//    String dock();
//    String cruise();
//}
//class Vehicle{
//    double load = 0;
//    double max_load = 0;
//
//    void getLoad(double load) {
//        System.out.println("Load : " + load);
//    }
//    void getMaxLoad(double max_load) {
//        System.out.println("Max Load : " + max_load);
//    };
//
//    void addBox(double weight) {
//        System.out.println("Add Box : " + weight);
//    };
//
//    public void calcFuelEffieciency(double fuel) {
//        System.out.println("Fuel Effieciency : " + fuel);
//    }
//
//    void calcTripDistance(double trip) {
//        System.out.println("Trip Distance : " + trip);
//    }
//}
//
//class Airplane extends Vehicle implements Flyer {
//
//    @Override
//    public String takeOff() {
//        return "+ Pesawat Lepas Landas Dari Bandara Soekarno Hatta Ke Bandara Incheon";
//    }
//
//    @Override
//    public String land() {
//        return "+ Pesawat Berhasil Mendarat Di Bandara Incheon";
//    }
//
//    @Override
//    public String fly() {
//        return "+ Pesawat Terbang Selama 7 Jam";
//    }
//}
//
//class SeaPlane extends Airplane implements Sailer {
//    @Override
//    public String dock() {
//        return "Jumlah Dermaga Seaplane, 5";
//    }
//
//    @Override
//    public String cruise() {
//        return "Jumlah Pelayaran Seaplane, 3";
//    }
//}
//
//class RiverBarge extends Vehicle implements Sailer {
//    @Override
//    public String dock() {
//        return "Jumlah Dermaga River Barge, 8";
//    }
//
//    @Override
//    public String cruise() {
//        return "Jumlah Pelayaran River Barge, 5";
//    }
//}