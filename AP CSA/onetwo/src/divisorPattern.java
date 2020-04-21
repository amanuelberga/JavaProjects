public class divisorPattern{
   public static void main(String [] args){
      int n = 5;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            if(i%j==0||j%i==0){
               System.out.print(" * ");
            }else
               System.out.print("  ");
         }
         System.out.println();
      }
      for (int q = 3; q > 1; q--)
{
    for (int w = 8; w > 1; w--)
        System.out.print("*");
    System.out.print(" ");
} 
   for (int e = 5; e >= 1; e--)
{
    for (int r = e; r >= 1; r--)
        System.out.print("*");
    System.out.print(" ");
}   
   }
}