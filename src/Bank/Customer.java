package Bank;

public class Customer extends Person implements Workable, Accounting {
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
        System.out.println("Будучи клиентом - работаю в качестве менеджера по продажам");
    }

    @Override
    public void accountProcess() {
        System.out.println("Как клиент банка, я могу совершать операции со своим счетом");
    }
}
