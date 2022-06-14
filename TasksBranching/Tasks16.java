package TasksBranching;

public class Tasks16 {
    public static void main(String[] args) {
        double x = 3.0;
        double y = -5.0;

        if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в 4 четверти");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится на оси y");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится на оси x");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в начале координат");
        }
    }
}
