package TasksBranching;

public class Tasks14 {
    public static void main(String[] args) {
        int corner1 = 20;
        int corner2 = 30;

        int corner3 = 180 - corner1 - corner2;

        if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
            System.out.println("Треугольник существует");
            if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
                System.out.println("Треугольник прямоугольный");
            }else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
