package TasksCycles;

public class Tasks14 {
    public static void main(String[] args) {
        int n = 10;
        double result = 1;
        for (double i = 2; i <= n; i++) {
            result +=1 / i;
        }
       System.out.print("result = " + result);

    }
}
