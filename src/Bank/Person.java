package Bank;

public abstract class Person {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //абстрактный метод для вывода всей информации;
    public abstract void showInfo();


}
