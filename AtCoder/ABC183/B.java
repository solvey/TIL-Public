package AtCoder.ABC183;
import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Sx = sc.nextDouble();
        double Sy = sc.nextDouble();
        double Gx = sc.nextDouble();
        double Gy = sc.nextDouble();
        double S_Distance = 0;
        double G_Distance = 0;
        double S_sin = 0;
        double G_sin = 0;
        double ans = 0;

        for(double i=Sx; i<Gx; i = i+0.00000001){
            S_Distance =Math.sqrt((Sx - i) * (Sx - i) + Sy * Sy);
            S_sin = Sy / S_Distance;
            G_Distance =Math.sqrt((Gx - i) * (Gx - i) + Gy * Gy);
            G_sin = Gy / G_Distance;
            if (S_sin == G_sin) {
                ans = i;
            }
        }
        System.out.println(S_Distance);
        System.out.println(ans);
        sc.close();
    }
}
