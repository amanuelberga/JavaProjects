/**
 * Created by Administrator on 10/10/2017.
 */

public class ama {
    public static void main(String[] args) {
        /*
        int x = 10, y = 8;
        if (x >= y/2)
            if (x >= y*2)
                x = x + 1;
            else
                y = y + 1;
        System.out.println(x);
        System.out.println(y);
        */
        boolean x = true;
        boolean y = true;
        boolean z = true;
        boolean a = (x && !y || z) || !z && x;
        System.out.println(a);


        int d = 40;
        switch (d) {
            case 20:
                d += 10;
            case 40:
                d -= 10;
            case 60:
                d *= 10;
            default:
                if (d > 100) {
                    d -= 100;
                }
        }
        System.out.println(d);
    }
}


