package TasksBranching;

public class Tasks17 {
    public static void main(String[] args) {
        int m = 6;
        int n = 36;

        int x;

        if (m != n) {
            x = Math.max(m, n);
            m = x;
            n = x;
        } else {
            m = 0;
            n = 0;
        }
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
