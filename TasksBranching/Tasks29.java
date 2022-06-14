package TasksBranching;

public class Tasks29 {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 6;

        int x2 = 2;
        int y2 = 6;

        int x3 = 3;
        int y3 = 6;

        if (x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3) {
            System.out.println("Точки A, B и C расположены на одной прямой");
        }else {
            System.out.println("Точки A, B и C не расположены на одной прямой");
        }


    }
}
