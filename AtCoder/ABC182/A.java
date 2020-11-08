package AtCoder.ABC182;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        ans = (A * 2 + 100) - B;
        System.out.println(ans);
        sc.close();
    }
}
