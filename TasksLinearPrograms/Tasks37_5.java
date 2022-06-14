package TasksLinearPrograms;

public class Tasks37_5 {
    public static void main(String[] args) {
        int x = 123;
        int x1 = x%1000/100;
        int x2 = x%100/10;
        int x3 = x%10;

        if(Math.pow(x,2) == Math.pow((x1+x2+x3),3)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
