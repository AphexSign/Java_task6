package Numbers;

public class Assistant extends Expert {

    public void showNum() {
        super.setNum();
        System.out.println("Унаследованное число: " + super.num);
    }

}
