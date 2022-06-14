package TasksCycles;

public class Tasks12 {
    public static void main(String[] args) {
        long composition = 1L;
        int an = 1;

        for (int i = 2; i <= 10; i++) {
            an = 6 + an;
            System.out.println(an);
            composition *= an;
        }

        System.out.println("Произведение первых 10 членов последовательности = " + composition);
    }
}
