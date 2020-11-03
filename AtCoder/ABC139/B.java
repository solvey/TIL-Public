package AtCoder.ABC139;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int q = B / A ;
        int availavle = (q + 1) * A;
        int ans = 0;

        if (availavle >= B) {
            ans = q + 1;
        } else {
            ans = q + 2;
        }
        

        System.out.println(ans);
        sc.close();
    }
}
