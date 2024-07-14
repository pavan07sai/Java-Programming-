import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.print("Enter the Operator:");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*') {
                System.out.print("Enter Two Numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }

            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid Number");
            }

            System.out.println(result);
        }
    }

}
