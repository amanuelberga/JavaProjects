public class OOTest{
   public static void main(String [] args){
      OnlineOrder user = new OnlineOrder("Amanuel",1,1,1,1);
      user.changeOrder(2,2,2,2);
      System.out.println(user.toString());
   }
}