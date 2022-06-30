package Numbers;

import java.util.Scanner;

public class Expert {
    public Integer num;
    Scanner scanner = new Scanner(System.in);

    public void setNum() {
        System.out.print("(класс-родитель) Введите число - ");
        this.num = scanner.nextInt();
    }


}
