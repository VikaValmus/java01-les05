package TasksBranching;

public class Tasks40 {
    public static void main(String[] args) {
        double x = 2;
        double f;
        if (x <= 13) {
            f = Math.pow(-x, 3) + 9;
            System.out.println("Значение функции f = " + f);
        }else if(x>13){
            f = -3 / (x+1);
            System.out.println("Значение функции f = " + f);
        }
    }
}
