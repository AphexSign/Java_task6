package Numbers;

//Создайте два класса: главный и класс-наследник.
//
//        В главном классе:
//        создайте поле для ввода целого числа;
//
//        В классе-наследнике:
//        метод для вывода переменной из главного класса.
//
//        Создайте объект на основе класса наследника и
//        выведите через метод переменную с главного класса.

public class NumberMain {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        assistant.showNum();
    }
}
