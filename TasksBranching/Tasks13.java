package TasksBranching;

public class Tasks13 {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;

        int x2 = -4;
        int y2 = -6;

       double c1 = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
       double c2 = Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));

       if (c1>c2){
           System.out.println("Точка А находится дальше от начала координат");
       } else if(c2>c1){
           System.out.println("Точка Б находится дальше от начала координат");
       }
    }
}
