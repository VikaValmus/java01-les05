package TasksBranching;

public class Tasks30 {
    public static void main(String[] args) {
        int a = -4;
        int b = -3;
        int c = 9;

        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
