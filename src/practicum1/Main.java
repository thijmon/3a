package practicum1;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
        int x = 1;
        while (x < 11) {
            double rand = Math.floor(Math.random() * 11);
            System.out.println(rand);
            x++;
        }
        int sum = 0;
        for (int y = 1; y <= 39; y++) {
            sum += y;
        }
        System.out.println(sum);
        String txt = "s";
        for(int o = 1; o<=4; o++){
            if(txt =="ss"){
                System.out.println(txt);
                txt = "s";
            } else{
                System.out.println(txt);
                txt = "ss";
            }
        }
    }
}
