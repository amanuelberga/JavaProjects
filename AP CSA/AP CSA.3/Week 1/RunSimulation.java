import java.util.Scanner;
public class RunSimulation{
   public static void main(String [] args){
      Hotel testHotel = new Hotel("Hilton",50,10);
      Room testRoom = new Room(100,"single king");
      System.out.println(testRoom.getRoomType());
      Room [] q1 = new Room [testHotel.getTotalRooms()];
      //System.out.println(q1[0].);
      q1[0]=testRoom;
      q1[0].setOccupant("Amanuel",34);
      //testHotel.rentRoom("single king", "amanuel", 40);
      //System.out.println(testHotel.toString());
      //System.out.println(testHotel.getOccupancyRate());
//       double x = (double)100/300;
//       double y = (double)Math.round(x*100)/100;
//       System.out.println(y);
//       System.out.println(testHotel.getTotalRooms());
      Scanner user = new Scanner(System.in);
      int a = user.nextInt();
      System.out.println(a+"Seriously, Amanuel");
   }
}