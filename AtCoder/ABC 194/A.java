import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A+B >= 15 && B >= 8) {
            System.out.println("1");
        }else if(A+B >= 10 && B >= 3){
            System.out.println("2");
        }else if (A+B >= 3) {
            System.out.println("3");
        }else {
          System.out.println("4");  
        }
        sc.close();
    }
}