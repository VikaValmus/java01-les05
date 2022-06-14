package TasksLinearPrograms;

public class Tasks37_2 {
    public static void main(String[] args) {
        int a = 1234;
        int x4 = a/1000;
        int x3 = a%1000/100;
        int x2 = a%100/10;
        int x1 = a%10;
        if (x1 + x2 == x3 + x4){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
