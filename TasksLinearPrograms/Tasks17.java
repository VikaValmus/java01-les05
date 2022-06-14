package TasksLinearPrograms;

public class Tasks17 {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;

        double s1 = (Math.pow(a,3)+Math.pow(b,3))/2;
        double s2 = Math.sqrt(Math.abs(a*b));

        System.out.println("среднее арифметическое кубов чисел = " +s1);
        System.out.println("среднее геометрическое модулей этих чисел = " +s2);
    }
}
