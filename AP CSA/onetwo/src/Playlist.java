public class Playlist{
   String [] nextFive;
   Playlist(){
      this.nextFive  = new String [5];
   }
   public boolean makeRequest(String songName){
           // for(int i=0; i<nextFive.length; i++){
//          if(nextFive[i]==null){
//             addSong(songName);
//             return true;
//          }else{
//             return false;
//          }
//       }
//       
      // if(searchList(songName)>=0){
//          return false;
//       }else{
//          for(int i=0; i<nextFive.length;i++){
//             if(nextFive[i]==null){
//                addSong(songName);
//             }else if(nextFive[i]!=null){
//                return false;
//             }
//          }
         if(searchList(songName)>=0||nextFive[nextFive.length-1]!=null){
               return false;
         }
         for(int i=0; i<nextFive.length;i++){
            if(nextFive[i]==null){
               nextFive[i]=songName;
               return true;
            }
         }
         return false;
      }
      //return false;
    // } 
   
   private int searchList(String songName){
      for(int i=0; i<nextFive.length; i++){
         if(songName.equals(nextFive[i])){
            return i;
         }
      }
      return -1;
   }
   private void addSong(String songName){
      if(searchList(songName)==-1){
         for(int i=0; i<nextFive.length; i++){
          if(nextFive[i]==null){
            nextFive[i]=songName;
            break;
          }
         }
      }
   }
   String getNextSong(){
      String s= nextFive[0];
      //nextFive[0]=" ";
         for(int y=0;y<nextFive.length-1;y++){
         nextFive[y]=nextFive[y+1];
        // nextFive[4]=null;
        
   }
   nextFive[nextFive.length-1]=null;
   return s;
  
}
}