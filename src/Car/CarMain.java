package Car;

public class CarMain {
    public static void main(String[] args) {

        char b = 'B';
        Truck truck = new Truck(10000, "Kamaz", b, 160, 6, 20000);
        truck.outPut();
        truck.newWheels(8);


    }
}
