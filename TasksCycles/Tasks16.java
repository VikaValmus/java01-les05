package TasksCycles;

public class Tasks16 {
    public static void main(String[] args) {
        int sum = 3;
        long result = sum;

        for (double i = 3; i <= 10; i++) {
            sum += i;
            result *= sum;
        }
        System.out.println("Произведение равно " + result);
    }
}
