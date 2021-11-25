package AtCoder.CODE_FESTIVAL_2016;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        int pass = 0;
        int rank = 0;
    
        for(int i=0; i<N; i++){
            char c = S.charAt(i);
            if (c == 'a') {
                if (pass < A + B) {
                    System.out.println("Yes");
                    pass ++;
                } else {
                    System.out.println("No");
                }
            } else if(c == 'b'){
                if (pass < A+B && rank < B) {
                    System.out.println("Yes");
                    pass++;
                    rank++;
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

}
