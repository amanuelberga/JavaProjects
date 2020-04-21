public class Practicee {
    public static void main(String[] args) {
          boolean[][] nbrs = {{true,false,false,true},
                             {false,false,true,true},
                             {true,true,false,true},
                             {false,true,false,false}};

          System.out.println(howManyNeighbors(nbrs,0,2)); // 3
          System.out.println(howManyNeighbors(nbrs,1,1)); // 4
          System.out.println(howManyNeighbors(nbrs,3,3)); // 1
     }

     public static int howManyNeighbors(boolean[][] n, int row, int col) {
          int startR, startC, endR, endC;
          int numNbrs = 0;

          /*** TODO: Set the values of startR, startC, endR, and endC to include the row
                     above and below the given input row, and the column above and below
                     the given input col, checking and adjusting for invalid array indices ***/
         startR=0;
      		endR=0;
         startC=0;
      		endC=0;
      
      
      

          for (int r = startR; r <= endR; r++)
          {
               for (int c = startC; c <= endC; c++)
               {
                    /*** TODO: Check the current array position, and if it is (1) true, and
                               (2) not the input row and col, execute the following block ***/
                     if(n[r][c]==true&&n[r][c]!=n[row][col]){
                         numNbrs++;
                    }
               }
          }
          return numNbrs;
     }
}
