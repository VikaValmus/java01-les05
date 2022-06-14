package TasksLinearPrograms;

public class Tasks37_3 {
    public static void main(String[] args) {
        int b = 123;
        int b1 = b%1000/100;
        int b2 = b%100/10;
        int b3 = b%10;
        if((b1+b2+b3) > 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
