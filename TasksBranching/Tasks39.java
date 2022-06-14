package TasksBranching;

public class Tasks39 {
    public static void main(String[] args) {
        double x = 2;
        double f;
        if (x>=8){
            f = Math.pow(-x, 2) + x - 9;
            System.out.println("Значение функции f = " + f);
        }else if (x<8){
            f = 1 / (Math.pow(x, 4) - 6);
            System.out.println("Значение функции f = " + f);
        }
    }
}
