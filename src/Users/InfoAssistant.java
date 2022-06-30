package Users;

//Нужно создать метод для ввода строки. typeInfo
public class InfoAssistant extends InfoMaster {
    private String userName;

    @Override
    public void typeInfo() {

        System.out.print("Введите имя пользователя - ");
        this.userName = super.scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.println("Имя пользователя: " + this.userName);
    }
}
