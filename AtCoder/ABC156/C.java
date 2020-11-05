package AtCoder.ABC156;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X[] = new int [N+1];
        
        int min = 0;

        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }

        for(int i=1; i<=100; i++){
            int HP_2 = 0;
            int HP = 0;
            for(int j=0; j<N; j++){
                HP_2 = X[j] - i;
                HP += HP_2 * HP_2;
            }
            if (min > HP) {
                min = HP;
            }
        }

        System.out.println(min);
        sc.close();
    }
}
