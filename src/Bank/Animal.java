package Bank;

public abstract class Animal {
    private String nick;

    public Animal(String nick){
        this.nick=nick;
    }
    public String getName(){
        return this.nick;
    }

    public abstract void say();
    public abstract void sniff(Person person);


}
