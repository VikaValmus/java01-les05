package TasksCycles;

public class Tasks33 {
    public static void main(String[] args) {
        int a = 23455;
        int[] mas = new int[5];
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a % 10;
            a /= 10;
        }
        max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("max = " + max);
    }
}
