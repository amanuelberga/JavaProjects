public class Activity{
   public static int foo(int x) {
     if (x == 0) return 1;
        return foo(x - 1) + 1;
   }
   public static int goo(int x, int y) {
       if (x * y < 100) return x * y;
          return goo(2*y,x/y);
   }
   public static String hoo(String a) {
       if (a.length() < 1) return "";
          return a.substring(a.length() - 1) + hoo(a.substring(0,a.length() - 1));
   }
   public static int woo(int a, int b) {
       if (a == b) return a;
       else if (a > b) return woo(a/2,b*2);
       else return woo(a*3,b/3);
   }
   public static void main(String [] args){
      System.out.println(foo(6));
      System.out.println(goo(24,6));
      System.out.println(hoo("redrum"));
      System.out.println(woo(20,6));
   }
}