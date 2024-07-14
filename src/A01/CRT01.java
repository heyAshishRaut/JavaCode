package A01;
import java.util.*;

public class CRT01 {
    public void Q01(int x, int y){
        if(x == 0 && y == 0){
            return;
        }
        while(true){
            if(x <= y){
                int replace = x;
                x = y;
                y = replace;
            }
            if(y == 0){
                System.out.println(x);
                return;
            }
            else{
                int t = x - y;
                x = y;
                y = t;
            }
        }
    }
    public static void main(String[] args) {
        // 167
        // 49, 36, 1
        // 16394
        CRT01 o = new CRT01();
        o.Q01(48, 18);
    }
}
