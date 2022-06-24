package Bank;

public class Employee extends Person implements Workable, Accounting {
    String bankName;

    public Employee(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Сотрудник банка: -" + this.bankName + "-                     Имя: " + this.getName() + "            Фамилия: " + this.getLastName());
    }

    @Override
    public void work() {
        System.out.println("Как сотрудник банка - я работаю в банке.");
    }

    @Override
    public void accountProcess() {
        System.out.println("В банке у меня есть доступ к счетам клиентов, я могу ими управлять");
    }
}
