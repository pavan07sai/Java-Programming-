class Computer {

    public void getMusic() {
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class method {
    public static void main(String[] args) {

        Computer com = new Computer();
        com.getMusic();

    }
}
