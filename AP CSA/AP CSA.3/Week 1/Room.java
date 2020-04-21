public class Room{
   private int roomNumber;
   private int daysRented;
   private String roomType;
   private String occupantName;
   
   public Room(int roomNumber, String roomType){
      this.daysRented = 0;
      this.occupantName = null;
      this.roomNumber = roomNumber;
      switch(roomType){
         case "single King":
            roomType = "single King";
            break;
         case "suite":
            roomType = "suite";
            break;
         case "double queen":
            roomType = "double queen";
            break;
         default:
            roomType = "double queen";
            break;
      }
   }
   
   public int getRoomNumber(){
      return roomNumber;
   }
   
   public int getDaysRented(){
      return daysRented;
   }
   
   public String getRoomType(){
      return roomType;
   }
   
   public String getOccupantName(){
      return occupantName;
   }
   
   public boolean setOccupant(String guestName, int days){
      if(occupantName!=null && daysRented>=0){
         return false;
      }
     
         occupantName = guestName;
         daysRented  = days;
         return true;
      
   }
   
   public void advanceDay(){
      daysRented--;
      if(this.daysRented <= 0){
         occupantName = null;
         daysRented = 0;
      }
 }
   
   public String toString(){
      if(occupantName==null){
         return "Room " + roomNumber + ": " +roomType  + " - free";
      }else{
         return "Room " + roomNumber + ": " +roomType  + " - rented";
      }
   }
}