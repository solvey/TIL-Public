package AtCoder.ARC107;

import java.util.*;

// 1からnまでの和
// n(n+1)/2で求める
// https://mathwords.net/1karannowa
// 余りを掛け算するときは、それぞれを予め割っても答は同じ
// a≡b (mod p), c≡d (mod p)のとき
// ac≡bd (mod p)

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sumA = 0;
        long sumB = 0;
        long sumC = 0;
        long mod = 998244353;

        sumA = (a * (a + 1) ) / 2;
        sumA %= mod;
        sumB = (b * (b + 1) ) / 2;
        sumB %= mod;
        sumC = (c * (c + 1) ) / 2;
        sumC %= mod;

        long ABSum = (sumA * sumB )% mod;
        long allSum = (ABSum * sumC) % mod;
        System.out.println(allSum);

        sc.close();
    }
}
