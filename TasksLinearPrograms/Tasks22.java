package TasksLinearPrograms;

public class Tasks22 {
    public static void main(String[] args) {
        int t = 3857;

        int hours = (t / 3600);
        int temp = t - (hours * 3600);
        int minutes = temp / 60;

        int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + t);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
    }
}
