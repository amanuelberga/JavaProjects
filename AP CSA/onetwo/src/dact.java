public class dact{
   public static void main(String [] args){
      int[][] mtrx = new int[3][4];
	for (int i = 0; i < mtrx.length; i++) {
		for (int j = 0; j < mtrx[i].length; j++) {
	System.out.println(mtrx[i][j] = i + j);
	}
}
   char[][] sentence = {{'I'},{'<','3'},{'c','o','m','p','u','t','e','r','s'}};
char[] select = new char[5];
int x = 0;
for (char[] line : sentence) {
	for (char c : line) {
		if (c > 100) {
			select[x] = c;
			x = ++x % 5;
         System.out.println("/////////////////////////////////////////////////////////////////////");
		}
	}
}
      System.out.println(select[2]);
   }
}