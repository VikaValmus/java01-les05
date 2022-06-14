package TasksBranching;

public class Tasks22 {
    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        int z;

        if (x < y) {
            z = y;
            y = x;
            x = z;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
