package TasksCycles;

public class Tasks24 {
    public static void main(String[] args) {
        int number = 123456;
        int numbers = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
        int sum = 0;
        while (number > 0) {
            if (number % 2 == 0) {
//                System.out.println(number % 10);
                sum += number % 10;
            }
            number /= 10;
        }
        System.out.println("Сумма всех четных цифр = " + sum);
        System.out.println(numbers);

    }
}
