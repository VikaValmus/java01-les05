package TasksBranching;

public class Tasks26 {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int c = -3;

        int max;
        int min;


        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        if (max < c) {
            max = c;
        } else if (min > c) {
            min = c;
        }

        int sum = max + min;
        System.out.println("sum = " + sum);
    }
}
