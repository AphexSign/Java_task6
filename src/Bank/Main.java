package Bank;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Вася", "Петров", "СПбБанк");
        Employee employee = new Employee("Дмитрий", "Яшин", "НефтьБанк");
        customer.showInfo();
        employee.showInfo();

        customer.accountProcess();
        employee.accountProcess();

        customer.work();
        employee.work();

        customer.tellWeather();

        System.out.println("");
        Dog dog = new Dog("Бобик");
        System.out.println(dog.getName());
        dog.tellWeather();
        dog.say();
        dog.sniff(customer);
        dog.sniff(employee);


    }
}
