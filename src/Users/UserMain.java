//        Создайте главный класс. Добавьте в него:
//        метод для получения возраста пользователя;
//
//        Создайте класс-наследник. Добавьте в него:
//        переопределенный метод для получения имени пользователя;
//
//        Создайте объект на основе класса-наследника и
//        используйте для него метод из класса.
//
//        Подсказка: подумайте над переменными, так как объект
//        класса Scanner удобнее создать лишь один раз в главном классе


package Users;

public class UserMain {
    public static void main(String[] args) {
        //Главный класс
        InfoMaster infoMaster = new InfoMaster();
        infoMaster.typeInfo();
        infoMaster.showInfo();
        //Вспомогательный класс
        InfoAssistant infoAssistant = new InfoAssistant();
        infoAssistant.typeInfo();
        infoAssistant.showInfo();
    }
}
