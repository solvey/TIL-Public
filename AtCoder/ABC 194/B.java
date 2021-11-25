import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int result = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int sum = 0;
                if (i==j) {
                    sum = A[i] + B[j];
                } else {
                    sum = Math.max(A[i], B[j]);
                }

                result = Math.min(result, sum);
            }
        }

        System.out.println(result);

        sc.close();
    }
}

