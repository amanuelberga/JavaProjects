public class ParkingSpace{
   int spaceNum;
   char floor;
   boolean isCompact;
   boolean  isOccupied;
   public ParkingSpace(int SpaceNum, char floor, boolean isCompact){
      this.spaceNum = SpaceNum;
      this.floor = floor;
      this.isCompact = isCompact;
      this.isOccupied = false;
   }
   public int getSpaceNum(){
      return spaceNum;
   }
   public char getFloor(){
      return floor;
   }
   public boolean getCompact(){
      return isCompact;
   }
   public boolean  getOccupied(){
      return isOccupied;
   }
   public void setOccupied(boolean a){
      isOccupied = a;
   }
   public String toString()
   {
     /************************************ if(getCompact()==true)
      {
         if(getOccupied()==true)
         {
         return '"'+String.valueOf(getFloor())+Integer.toString(getSpaceNum())+"(CX)"+'"'/*+"(this space is for compact cars, and is occupied)";
         }
         else
         {
         return '"'+String.valueOf(getFloor())+Integer.toString(getSpaceNum())+"(CO)"+'"'/*+"(this space is for compact cars, and is not occupied)";
         }
      }
      else
      {
         if(getOccupied()==true)
         {
         return '"'+String.valueOf(getFloor())+Integer.toString(getSpaceNum())+"(NX)"+'"'/*+"(this space is for any car, and is occupied)";
         }
         else
         {
         return '"'+String.valueOf(getFloor())+Integer.toString(getSpaceNum())+"(NO)"+'"'/*+"(this space is for any car, and is not occupied)";
         }
      }
      */
          String an = '"'+String.valueOf(getFloor())+Integer.toString(getSpaceNum());
      if(getCompact()==true)
      {
         if(getOccupied()==true)
         {
         an = an + " (C X)"+'"'/*+"(this space is for compact cars, and is occupied)"*/;
         //return an;
         }
         else
         {
         an = an + " (C O)"+'"'/*+"(this space is for compact cars, and is not occupied)"*/;
         //return an;
         }
      }
      else
      {
         if(getOccupied()==true)
         {
         an = an + " (N X)"+'"';
         //return an;
         }
         else
         {
         an = an + " (N O)"+'"';
         //return an;
         }
      }
      return an;
         public static void main(String [] args){
        ParkingSpace a = new ParkingSpace(56, 'Q', false);
        a.setOccupied(true);
       System.out.println(a.toString());
      }       
   
   }
   
   
   
   
   
   
   
   