package AtCoder.ABC139;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        // int A = Integer.parseInt(sc.next());
        // int B = Integer.parseInt(sc.next());
        int availavle = 1;
        int ans = 0;

        while (availavle < B) {
                availavle = availavle + A - 1;
                ans ++;
        }
            // if (availavle >= B) {
            //     ans = q + 1;
            // } else {
                
                // ans = q + 2;
            //}
    
        
        

        System.out.println(ans);
        sc.close();
    }
}
