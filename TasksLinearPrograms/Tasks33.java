package TasksLinearPrograms;

public class Tasks33 {
    public static void main(String[] args) {
        char a = 'F';
        int a1 = (int) a;

        System.out.println("Исходный символ: " + a + " его номер: " + a1);
        System.out.println("Предыдущий символ: " + (char) (a1 - 1) + " его номер: " + (a1 - 1));
        System.out.println("Следующий символ: " + (char) (a1 + 1) + " его номер: " + (a1 + 1));
    }
}
