/**
 * Created by Amanuel on 10/10/2017.
 */
import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year % 4==0 && year % 100==0 && year % 400 != 0){
            return false;
        }
        if(year % 4==0 && year % 100!=0){
            return true;
        }
        if(year % 400==0){
            return true;
        }

        return false;

    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year?");
        int y = s.nextInt();

        if(isLeapYear(y)== true) {
            System.out.println("The year " + y + " is a leap year");
        }else {
            System.out.println("The year " + y + " is not a leap year");
        }


    }
}
