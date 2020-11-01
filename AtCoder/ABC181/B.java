package AtCoder.ABC181;

// 反省点：愚直解で解かない。整数の和の合計 n(n+1)/2を上手く使うこと

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long sum = 0;

        for(long i=1; i<=N; i++){
            long A = sc.nextInt();
            long B = sc.nextInt();

            sum += (B*(B+1)) / 2 - (A*(A-1)) / 2;
        }

        System.out.println(sum);
        sc.close();
    }
}