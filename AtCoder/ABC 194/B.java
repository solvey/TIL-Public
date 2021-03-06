import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(sc.nextInt());
            B.add(sc.nextInt());
        }

        int minA = 0;
        int minB = 0;
        int keyA = 0;
        int keyB = 0;

        for(int i=0; i<N; i++){
            if(A.get(i) <= minA){
                minA = A.get(i);
                keyA = i;
            } 
        }

        for(int i=0; i<N; i++){
            if(B.get(i) <= minB){
                minB = B.get(i);
                keyB = i;
            } 
        }

        if (keyA == keyB) {
            System.out.println(minA + minB);
        } else {
            System.out.println(Math.max(minA, minB));
        }


        sc.close();
    }
}