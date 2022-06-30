package Car;

public class Car {

    public int weight;
    public String model;
//    public char color;
    public Color color;
    public float speed;


    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed+ " км/ч");
    }

    public Car(int w, String m, Color color, float s) {
        weight = w;
        model = m;
        this.color = color;
        speed = s;
    }

    public Car() {
    }


}
