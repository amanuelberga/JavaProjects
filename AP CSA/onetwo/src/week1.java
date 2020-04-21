import java.util.Scanner;
public class week1{
public static void main(String[] args) {
         /**relation practice
          int x = 0, howMuch = 0;

          /*** TODO: Write a while loop that runs until x is 6 ***
          while(5 >= x){
               howMuch = howMuch + x;
               x++;
          }
          System.out.println("The final value of x is " + x + " and howMuch is " + howMuch);
          **/
          /**
          Scanner scn = new Scanner(System.in);
          int x = 0, howMuch = 0;

          /*** TODO: Write a while loop that runs until the user enters a non-integer 
          while(scn.hasNextInt()){
          
          
          
               x = scn.nextInt();
               howMuch = howMuch + x;
          }
          System.out.println("The final value of howMuch is " + howMuch);
          **/
          int b = 0;
      
      	  /*** TODO: Write a for-loop that repeats using a variable i to store
                     the values 1 to 24, incrementing i by 1 each repetition. ***/
          
          for(int i = 1; i<=24; i++){
               if (i % 24 != 0) {
                   b++;
                    System.out.println("Time to start over again! Repetition number : " + b);
                    }
                    }
}
}
