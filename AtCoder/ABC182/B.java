package AtCoder.ABC182;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int [n];
        int max = 0;
        // int count = 0;
        int maxCount = 0;
        int ans = 0;

        // 数列を作成し、数列の中の最大値を求めておく
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
            if(max < array[i]){
                max = array[i];
            }
        }

        // 数列内の各値をmaxまで割ってみる
        for(int i=2; i<=max; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if (array[j] % i ==0) {
                    count ++;
                } 
            }
            if (maxCount < count) {

                    ans = i;
                    maxCount = count;
                
                
            }
        }

        

        if (maxCount == 0) {
            ans = 2;
        }

        

        System.out.println(ans);
        sc.close();
    }
}
