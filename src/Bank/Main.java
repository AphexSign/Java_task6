package Bank;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Вася", "Петров", "СПбБанк");
        customer.showInfo();

        Employee employee = new Employee("Дмитрий", "Ерохов", "НефтьБанк");
        employee.showInfo();

        customer.accountProcess();
        employee.accountProcess();

        customer.work();
        employee.work();

    }
}
