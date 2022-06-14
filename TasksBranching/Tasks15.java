package TasksBranching;

public class Tasks15 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;

//        int min = Math.min(x,y);

        if (x > y) {
            y = (x + y) / 2;
            x = x * y * 2;
        } else {
            x = (x + y) / 2;
            y = x * y * 2;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
