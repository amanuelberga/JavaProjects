public class week3{
    public static void main(String[] args) {

          /*** TODO: Declare a new array, monthAry, that stores the exact
                     values: {"Jan","Feb","Mar","Apr","May","Jun","Jul",
                              "Aug","Sep","Oct","Nov","Dec"} ***

      	  String [] monthAry = new String[12];
      	  monthAry [0] ="Jan";
           monthAry [1] = "Feb";
           monthAry [2] = "Mar";
           monthAry [3] = "Apr";
           monthAry [4] = "May";
           monthAry [5] = "Jun"; 
           monthAry [6] = "Jul";
           monthAry [7] = "Aug";
           monthAry [8] = "Sep";
           monthAry [9] = "Oct";
           monthAry [10] = "Nov";
           monthAry [11] = "Dec";
      	  for (int i = 0; i < 12; i++) {
               System.out.println(monthAry[i]);
               
          int [] cal = new int[]
          }**/
           boolean[] roomClean = {true, false, false, true, false, true, true, false};

          /*** TODO: Write the header for a for-loop that iterates through
                     roomClean, using "i" as the counter variable ***/

      		for(int i = 1; i <= roomClean.length +1; i++){
      			/*** TODO: Write an if-statement that will execute the block if
                          the current room needs to be cleaned ***/
				if(roomClean[i]==false){
      
      
      				System.out.println("Room " + i + " needs cleaning");
               }
          }
     }

}