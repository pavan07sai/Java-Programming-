public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Swap(a, b);
        System.out.println(a + " " + b);

    }

    static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
