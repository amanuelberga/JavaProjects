public class Hotel{
   private String hotelName;
   private int totalRooms;
   Room [] rooms;
   
   public Hotel(String hotelName, int totalRooms, int numFloors){
      this.hotelName = hotelName;
      this.totalRooms = totalRooms;
      rooms = new Room[totalRooms];
      String rt = "";
      for(int f=1; f<=numFloors; f++){
         for(int r=1; r<=(totalRooms/numFloors); r++){
            if(r<(totalRooms/numFloors)-5){
               rt = "double queen";
            }else if(r<(totalRooms/numFloors)-1){
               rt = "single king";
            }else{
               rt = "suite";
            }
            rooms[r] = new Room(f*100+r,rt);
         }
      }
   }
   
   public int getTotalRooms(){
      return totalRooms;   
   }
   
   public int  getNumberOccupied(){
   int numberOccupied = 0;
      for(int i=0; i<rooms.length; i++){
         if(rooms[i].getOccupantName()!=null){
            numberOccupied++;
         }
      }
      return numberOccupied;
   }
   
   public double getOccupancyRate(){
      double f = (double)getNumberOccupied()/totalRooms;
      double occupancyRate = (double)Math.round(f*100)/100;
      return occupancyRate;
   }
   
   public boolean rentRoom(String roomT, String occupantName, int daysRented){
      for(int i=0; i<rooms.length; i++){
         if(rooms[i].getOccupantName()!=null){
            if(rooms[i].getRoomType()==roomT){
               rooms[i].setOccupant(occupantName,daysRented);
               return true;
            }
         }
         //break;
      }
      return false;
   }
   
   public void advanceDay(){
      for(int i=0; i<rooms.length; i++){
         rooms[i].advanceDay();
      }
   }
   
   public String toString(){
      double a = getOccupancyRate()*100;
      return hotelName+": "+ a + "% occupied";
   }
}