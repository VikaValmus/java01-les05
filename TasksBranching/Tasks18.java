package TasksBranching;

public class Tasks18 {
    public static void main(String[] args) {
        int a = -3;
        int b = -2;
        int c = -5;

        int cout = 0;

        if (a <= 0) {
            cout = cout + 1;
        }

        if (b <= 0) {
            cout = cout + 1;
        }

        if (c <= 0) {
            cout = cout + 1;
        }
        System.out.println("количество отрицательных чисел = " + cout);


    }
}
