public class strb {
    public static void main(String[] a) {
        StringBuffer str = new StringBuffer("Pavan Sai ");
        str.append("Nakka");
        System.out.println(str);
        System.out.println("Length of the String: " + str.length());
        System.out.println("Capacity of the String: " + str.capacity());
    }

}
