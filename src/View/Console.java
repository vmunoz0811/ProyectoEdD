package View;

import java.util.Scanner;

public class Console {
    private Scanner read;

    public Console() {
        read = new Scanner(System.in);
    }

    public int readInt(String msg) {
        System.out.println(msg);
        int data = read.nextInt();
        read.nextLine();
        return data;
    }

    public String readString(String msg) {
        System.out.println(msg);
        String data = read.nextLine();
        return data;
    }

    public void showInfo(String msg) {
        System.out.println(msg);
    }
}
