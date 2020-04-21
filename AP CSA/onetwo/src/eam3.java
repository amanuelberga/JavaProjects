public class eam3{
   public static void main(String [] args){
   /**   int[] ary = new int[5];
for (int x = 1; x < ary.length; x += 2){
    System.out.println(ary[x] = x - ary[x - 1]);
    }
    int[] evens = { 2, 4, 6, 8, 10 };
int total = 0;
for (int b : evens)
{
    total += b;
    b = total;
}
System.out.println(evens[0]);
System.out.println(evens[1]);
System.out.println(evens[2]);
System.out.println(evens[3]);
System.out.println(evens[4]);
System.out.println("////////////////////////");
**
int[] ary = {7, 2, 5, 3, 0, 10};
for (int k = 0; k < ary.length - 1; k++)
{
    if (ary[k] > ary[k + 1])
        System.out.print(k + " " + ary[k] + " ");
}


int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
for (int x = 0; x < array.length; x++)
{
    for (int y = 0; y < array[x].length; y++)
    {
        System.out.print(array[x][y] + " ");
    }
    System.out.println();
}
***/
int[][] a = {{3, 2, 1}, {1, 2, 3}};
int value = 0;
for (int row = 1; row < a.length; row++)
{
    for (int col = 1; col < a.length; col++)
    {
        value = a[row][col];
        if (value % 2 == 1) 
            a[row][col] = value + 1;
        if (a[row][col] % 2 == 0)
            a[row][col] = value * 2;
            System.out.println(a[row]);
            System.out.println(a[col]);
    }
}
System.out.println(a[2][0]);
System.out.println(a[2][1]);
System.out.println(a[2][2]);
// //System.out.println(a[0][1]);
//   int[] ary = new int[5];
// for (int x = 1; x < ary.length; x += 2){
//     System.out.println(ary[x] = x - ary[x - 1]);   
//     }
//     System.out.println(ary[4]);
     }
   
}