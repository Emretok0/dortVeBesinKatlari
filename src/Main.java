import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Sayı: ");
        int i = in.nextInt();

        for (int x=4; x<i; x*=4){
            System.out.println(x);
        }
        for (int y=5; y<i; y*=5){
            System.out.println(y);
        }
    }
}
