import java.util.Scanner;
public class Robot {
 /* void speak()//this is a method {
    System.out.println("HI!");
  }
 */
  String name;
  double height;
  Robot(String name ){//class constractor
    this.name = name;
  }
   Robot(double height ){//class constractor
    this.height = height;
  }
  void speak(String msg){/*Parameter::this method will alow to print what ever we want.... We can also add a variable */
    System.out.println(msg + name);//We can also add a variable 
  }
  public static void main(String[] args){
    Robot r = new Robot("Aman");//we created a new object
    /* 
     * we called the method speak
     * r.speak();//we cllled the method speak and it will print HI
     * */
      //r.name="Aman";//gives the robot the name
      r.speak("Hello I am... ");//prints hello which is an argument
      Scanner s = new Scanner(System.in);
      double b = s.nextDouble();
      Robot a = new Robot(b);
      
      
  }
}