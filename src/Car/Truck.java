package Car;

public class Truck extends Car {

    int wheelCount = 4;
    int maxCapacity;

    public Truck(int weight, String model, char color, float speed, int wheelCount, int maxCapacity) {
        super(weight, model, color, speed);
        this.wheelCount = wheelCount;
        this.maxCapacity = maxCapacity;
    }


    public void newWheels(int wheel) {
        //Колес не может нечетное количество, и их не может быть меньше 3
        if (wheel <= 3 || wheel % 2 == 1) {
            System.out.println("Недопустимое значение колес");
        } else {
            this.wheelCount = wheel;
            System.out.println("Текущее количество колес на грузовике: " + this.wheelCount);
        }
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.print("Кол-во колес:" + this.wheelCount + "    Макс. грузоподъемность: " + this.maxCapacity);
        System.out.println();
    }
}
