package TasksLinearPrograms;

public class Tasks13 {
    public static void main(String[] args) {
        double x1 = 3;
        double y1 = 4;
        double x2 = 6;
        double y2 = -2;
        double x3 = -1;
        double y3 = 5;

        double l1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double l2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double l3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        double p = l1 + l2 + l3;
        double p1 = 0.5 * p;
        double s = Math.sqrt(p1*(p1-l1)*(p1-l2)*(p1-l3));

        System.out.println("периметр треугольника = " + p);
        System.out.println("площадь треугольника = " + s);
    }
}
