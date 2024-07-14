import java.util.*;

public class Ternary {

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        double d = (double) n;

        if (n == d) {
            System.out.println(d);
        }

        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);

    }
}
