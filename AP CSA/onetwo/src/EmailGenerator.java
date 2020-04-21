/**
 * Created by Administrator on 10/1/2017.
 */
import java.util.Scanner;
public class EmailGenerator {
    static String first;
    static String last;

    //EmailGenerator(String first, String last){
   //     this.first = first;
  //      this.last = last;
  //  }
    public static String makeUserName(String s1,String s2){
        String s =s1.substring(0,3) + '.' + s2.substring(0,3);
        return s.toLowerCase();

    }
    public static String makeEmail(String s1, String s2) {
      String e = s1+"@"+s2;
      return e.toLowerCase();
 }
    public static void main(String[] args){
        String emailsuffix="youworkforme.us";
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your fist name");
        String f = info.nextLine();
        System.out.println("Enter your last name");
        String l = info.nextLine();
        EmailGenerator user = new EmailGenerator();
        String alias= makeUserName(f,l);
        String email= makeEmail(alias,emailsuffix);
        System.out.println("The students username is: " + alias);
        System.out.println("This Student's e-mail is: " + email);

    }
}
