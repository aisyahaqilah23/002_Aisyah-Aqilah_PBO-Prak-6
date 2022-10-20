public class prak6_no3 {
    public static void main(String[] args) {

        System.out.println("=== Pesawat ===");
        Vehicle airplane_1 = new Vehicle();
        airplane_1.getLoad(20);
        airplane_1.getMaxLoad(150);
        airplane_1.addBox(25);
        airplane_1.calcFuelEffieciency(200);
        airplane_1.calcTripDistance(30000);
        System.out.println("\n");

        Flyer airplane = new Airplane();
        System.out.println(airplane.takeOff());
        System.out.println(airplane.land());
        System.out.println(airplane.fly());

        System.out.println("\n=== Burung ===");
        Bird bird = new Bird();
        System.out.println(bird.takeOff());
        System.out.println(bird.land());
        System.out.println(bird.fly());
        System.out.println(bird.buildNest());
        System.out.println(bird.layEggs());
        System.out.println(bird.eat("Serangga"));

        System.out.println("\n=== Superman ===");
        Superman superman = new Superman();
        System.out.println(superman.takeOff());
        System.out.println(superman.land());
        System.out.println(superman.fly());
        System.out.println(superman.leapBuilding());
        System.out.println(superman.stopBullet());
        System.out.println(superman.tampil("Mark Lee", 24));
    }
}

interface Flyer{
    String takeOff();
    String land();
    String fly();
}

class Animal {
    String eat(String food) {
        return "Makanan Burung : " + food;
    }
}

class Human {
    String tampil(String name, int age) {
        return "Nama : " + name + "\nUmur : " + age;
    }
}

class Airplane extends Vehicle implements Flyer {

    @Override
    public String takeOff() {
        return "+ Pesawat Lepas Landas Dari Bandara Soekarno Hatta Ke Bandara Incheon";
    }

    @Override
    public String land() {
        return "+ Pesawat Berhasil Mendarat Di Bandara Incheon";
    }

    @Override
    public String fly() {
        return "+ Pesawat Terbang Selama 7 Jam";
    }
}

class Bird extends Animal implements Flyer{

    @Override
    public String takeOff() {
        return "+ Burung Kutilang Terbang Dari Ketinggian 900 Meter Diatas Permukaan Laut";
    }

    @Override
    public String land() {
        return "+ Burung Kutilang Mendarat Tepat Pada Atap Rumah Pak Andi";
    }

    @Override
    public String fly() {
        return "+ Burung Kutilang Terbang Selama 45 Menit";
    }

    public String buildNest() {
        return "+ Burung Kutilang Membangun Sarangnya Di Batang Pohon Yang Tertutup";
    }

    public String layEggs() {
        return "+ Burung Kutilang Mengerami Telurnya";
    }
}

class Superman extends Human implements Flyer {

    @Override
    public String takeOff() {
        return "+ Superman Terbang Dengan Cepat Menuju Tempat Terjadinya Pembunuhan";
    }

    @Override
    public String land() {
        return "+ Superman Mendarat Di Tempat Terjadinya Pembunuhan";
    }

    @Override
    public String fly() {
        return "+ Superman Terbang Dengan Kecepatan 80 Km/jam";
    }

    public String leapBuilding() {
        return "+ Superman Terbang Melewati Banyak Gedung Tinggi";
    }

    public String stopBullet() {
        return "+ Superman Tidak Bisa Ditembak Peluru";
    }
}