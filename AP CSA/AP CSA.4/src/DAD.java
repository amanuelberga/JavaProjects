import java.util.Scanner;

public class DAD {
public static void main(String [] args){
    practice3();

}
    public static void practice1(){
        for(int i=1; i<=7; i++){
            //System.out.println(1 + " ");
            for(int j=1;j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

    public static void practice2(){
        for(int i=7;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }

    public static void practice3(){
        System.out.print("Accept a Number from the user:    ");
        Scanner user = new Scanner(System.in);
        int r = user.nextInt();
        if(r==1 || r==2){
            System.out.println(r +" is prime");
        }
       for(int i=2; i<r; i++){

           if(r%i==0){
               System.out.println(r + " is not a prime number");
               //break;
           }else {
               System.out.println(r + " is a prime number");
           }
       }
    }
}
