/**
 * Created by Administrator on 9/24/2017.
 */


import java.util.Scanner;
public class Associative{
    public int x;
    public int y;
    public int z;
    Associative(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int firstTwo(){
        return (x+y)*z;
    }
    public int lastTwo() {
        return x+(y*z);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Associative res = new Associative(a,b,c);
        res.firstTwo();
        System.out.println("Grouping the first two terms,"  + res.firstTwo());
        res.lastTwo();
        System.out.println("Grouping the last two terms," + res.lastTwo());

        }
    }

