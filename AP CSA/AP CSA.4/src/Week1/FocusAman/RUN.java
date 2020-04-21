package FocusAman;
import java.util.ArrayList;
import java.util.Scanner;
public class RUN {
    public static void main(String [] args){
        Scanner user  = new Scanner(System.in);

        ArrayList<String> ninth = new ArrayList<>();
        while(user.hasNext() && !user.hasNextInt()){
            ninth.add(user.next());
        }
    }
}
