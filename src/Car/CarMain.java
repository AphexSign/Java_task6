package Car;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car(1088, "Lada", Color.WHITE, 185.0f);
        car.outPut();
        System.out.println();

        Truck truck = new Truck(6180, "Kamaz", Color.BLACK, 165.0f, 8, 7000);
        truck.outPut();
        truck.newWheels(10);


    }
}
