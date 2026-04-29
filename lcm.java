
import java.util.*;

public class lcm {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lcm = findlcm(int a
        ,int b,
        int c
        );
        System.out.println("lcm is:" + lcm);
    }

    public static int findgcd(int a, int b, int c) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findlcm(int a, int b, int c) {
        int lcmAB = (a * b) / gcd(a, b);
        return findlcm(lcmAB, c);
    }
}
