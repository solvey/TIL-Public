package AtCoder.ABC181;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();

        if (inputN % 2 == 0) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }

        sc.close();
    }
}
