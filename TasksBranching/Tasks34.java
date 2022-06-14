package TasksBranching;

import java.util.Scanner;

public class Tasks34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;  //стоимость книг
        int sum; //сумма денег, внесенная покупателем
        System.out.println("введите стоимость книги");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("не-не > ");
        }
        count = sc.nextInt();

        System.out.println("сумму денег, внесенную покупателем");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("не-не > ");
        }
        sum = sc.nextInt();

        if (sum > count) {
            int x = sum - count;
            System.out.println("возьмите сдачу в размере " + x + " руб.");
        } else if (sum < count) {
            int x = count - sum;
            System.out.println("не достаточно денег на покупку кгини");
            System.out.println("внесите еще " + x + " руб.");
        } else if (sum == count) {
            System.out.println("спасибо");
        }


    }
}
