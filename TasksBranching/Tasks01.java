package TasksBranching;

import java.util.Scanner;

public class Tasks01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("7");

        } else {
            System.out.println("8");
        }
    }
}
