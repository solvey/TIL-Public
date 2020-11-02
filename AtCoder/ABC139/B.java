package AtCoder.ABC139;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        if (A < B) {
            if(B % A == 0){
                ans = B / A;
            } else {
                ans = (B / A) +1;
            }
        } else {
            ans = 1;
        }
        

        System.out.println(ans);
        sc.close();
    }
}
