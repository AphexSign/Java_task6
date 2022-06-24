package Users;

import java.util.Scanner;

//Нужно создать метод для ввода строки. typeInfo
//	метод для получения возраста пользователя;
public class InfoMaster {
    private Integer ageUser;
    protected Scanner scanner = new Scanner(System.in);

    public void typeInfo() {
        System.out.print("Введите возраст пользователя - ");
        this.ageUser = this.scanner.nextInt();
    }

    public void showInfo() {
        System.out.println("Возраст юзера: " + this.ageUser);
    }

    public Integer getAgeUser() {
        return this.ageUser;
    }

}
