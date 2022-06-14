package TasksLinearPrograms;

public class Tasks32 {
    public static void main(String[] args) {
        int m = 18;
        int n = 35;
        int k = 10;
        int resultSecond1 = m * 3600 + n * 60 + k;

        int p = 1;
        int q = 25;
        int r = 30;
        int resultSecond2 = p * 3600 + q * 60 + r;

        int resultSecond = resultSecond1+resultSecond2;

        int hours = (resultSecond / 3600);
        int temp = resultSecond - (hours * 3600);
        int minutes = temp / 60;

        int seconds = temp - (minutes * 60);

        System.out.println(m + " ч. " + n + " мин. " + k + " c.");

        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");


    }
}
