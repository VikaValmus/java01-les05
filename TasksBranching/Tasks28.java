package TasksBranching;

public class Tasks28 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 6;

        int d = 4;

        if (a == d) {
            System.out.println("a равно d");
        } else {
            System.out.println(Math.max(d, a));
        }

        if (b == d) {
            System.out.println("b равно d");
        } else {
            System.out.println(Math.max(d, b));
        }

        if (c == d) {
            System.out.println("c равно d");
        } else {
            System.out.println(Math.max(d, c));
        }
    }
}
