package TasksBranching;

import java.util.Scanner;

public class Tasks21 {
    public static void main(String[] args) {
        System.out.println("Кто ты: мальчик или девочка? Введи D или M»");

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        if (st.equals("D")){
            System.out.println("Мне нравятся девочки!");
        }else if(st.equals("M")) {
            System.out.println("Мне нравятся мальчики");
        }
    }
}
