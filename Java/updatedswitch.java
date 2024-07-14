import java.util.*;

public class updatedswitch {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                break;

            }

            switch (str) {
                case "Monday", "Tuesday" -> System.out.println("7am");
                case "Wednesday", "Thursday" -> System.out.println("8am");
                case "Friday", "Saturday" -> System.out.println("9am");

                default -> System.out.println("10am");

            }

        }
        sc.close();

    }

}

/*
 * switch(type){
 * case condition,condition : yield print statement;
 * case condition,condition : yield print statement;
 * default : yield print statement;
 * }
 */

/*
 * import java.util.*;
 * 
 * public class updatedswitch {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * while (true) {
 * String str = sc.nextLine();
 * 
 * if (str.equalsIgnoreCase("exit")) {
 * break;
 * }
 * 
 * switch (str) {
 * case "Monday", "Tuesday" -> System.out.println("7am");
 * 
 * case "Wednesday", "Thursday" -> System.out.println("8am");
 * 
 * default -> System.out.println("9am");
 * 
 * }
 * }
 * 
 * sc.close();
 * }
 * }
 * 
 */