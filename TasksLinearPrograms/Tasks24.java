package TasksLinearPrograms;

public class Tasks24 {
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        double alpha = 30;

        double s = 0.5*(Math.pow(a,2) - Math.pow(b,2)) * Math.tan(Math.toRadians (alpha));
        System.out.println("площадь равнобедренной трапеции = " + s);
    }
}
