public class ParkingLot{
   ParkingSpace [] parkingLot;
   int numSpaces;
   int numFloors;
   public ParkingLot(int numSpaces, int numFloors){
      this.numSpaces=numSpaces;
      this.numFloors=numFloors;
      parkingLot=new ParkingSpace[numSpaces*numFloors];
      int x=0;
      for(int i=0; i<numFloors; i++){
         for(int j=0; j<numSpaces; j++){
            if(j<4){
               parkingLot[x] = new ParkingSpace(j,(char)(65+i), true);
            }else{
               parkingLot[x] = new ParkingSpace(j,(char)(65+i), false); 
            }
            x++;
         }
      }
   }
   ParkingSpace enterLot(boolean c){
      int i;
      for(i=0; i<parkingLot.length; i++){
         if(c==true){
            if(!parkingLot[i].getOccupied()){
               parkingLot[i].setOccupied(true);
               return parkingLot[i];
            }
         }else{
            if(!parkingLot[i].getOccupied()&&!parkingLot[i].getCompact()){
               parkingLot[i].setOccupied(true);
               return parkingLot[i];
            }
         }
      }
      return null;  
   }
   void  leaveLot(ParkingSpace p){
     // int q = ();
     // char w = p.getFloor();
     // boolean e = p.getCompact();
      //ParkingSpace r = ParkingSpace(q, (char)(w), e);
      //p.getSpaceNum(); p.getFloor(); 
      for(int i=0; i<parkingLot.length; i++){
         if(parkingLot[i].getFloor()==p.getFloor()&&parkingLot[i].getSpaceNum()==p.getSpaceNum())
         {
            parkingLot[i].setOccupied(false);
            break;
         }
      }
      
   }
}