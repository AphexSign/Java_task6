package Bank;

public class Customer extends Person implements Workable, Accounting, ChitChat {
    String bankname;

    public Customer(String name, String lastName, String bankname) {
        super(name, lastName);
        this.bankname = bankname;
    }

    @Override
    public void showInfo() {
        System.out.println("Клиент банка: -" + this.bankname + "-                          Имя: " + this.getName() + "               Фамилия: " + getLastName());
    }

    @Override
    public void work() {
        System.out.println("(Клиент) работаю в качестве менеджера по продажам в своей компании");
    }

    @Override
    public void accountProcess() {
        System.out.println("(Клиент) я могу совершать операции со своим счетом");
    }

    @Override
    public void tellWeather() {
        System.out.println("(Клиент)Сегодня отличная погода");
    }
}
