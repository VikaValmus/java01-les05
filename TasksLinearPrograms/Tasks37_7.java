package TasksLinearPrograms;

public class Tasks37_7 {
    public static void main(String[] args) {
        int a = 123;
        int a1 = a % 1000 / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;
        if ((a1 + a2) == a3 || (a1 + a3) == a2 || (a2 + a3) == a1) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
