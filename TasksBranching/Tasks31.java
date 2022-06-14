package TasksBranching;

public class Tasks31 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        int x = 7;
        int y = 10;
        int z = 9;

        if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || x <= b && z <= a || y <= b && z <= a || y <= a && z <= b){
            System.out.println("кирпич пройдет через отверстие");
        }else {
            System.out.println("кирпич не пройдет через отверстие");
        }
    }
}
