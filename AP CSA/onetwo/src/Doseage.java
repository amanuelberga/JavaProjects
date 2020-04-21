/**
 * Created by Administrator on 10/10/2017.
 */
import java.util.Scanner;;
public class Doseage {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        double medLevel = 3.68;
        double epsilon = 0.005;
        double dosage = s.nextDouble();
        if (dosage < medLevel + epsilon && dosage > medLevel - epsilon) {
            System.out.println("Correct dosage provided");
        } else if (dosage > medLevel + epsilon) {
            System.out.println("Dosage is too high");
        } else {
            System.out.println("Dosage is too low");
        }
    }
}
