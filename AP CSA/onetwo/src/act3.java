public class act3{
   public static void main(String [] args){
      int[] ary = new int[5]; 
      for (int x = 0; x < ary.length; x++) {
         ary[x] = 2 * x + 1;
         System.out.println(ary[x]);
      }
      double[] ab = {1,2,3,4};
      int i = 0;
      while (i < ab.length ) {
         ab[i++] = Math.sqrt(ab[i - 1]);
         //System.out.println(ab[i]);
      }
      String[] abc = {"boo","hoo","wah","sniffle"};
      for (int a = 0; a < abc.length; a++) {
         abc[a] = abc[a].substring(a);
         System.out.println(abc[a]);
      }
      double[] ar = {1,2,3,4};
int p = 0;
while (p < ar.length) {
      ar[p] = Math.pow(ar[p],ar[1]);
      p++;
      //System.out.println(ar[p]);

   }
double[] arya = new double[5]; 
arya[3] = 7;
arya[1] = 3;
int sum = 0;
for (double q: arya) {
      sum += q;
     // System.out.println(arya[sum]);
}
int[] arys = new int[5]; 
for (int w: arys) {
      w = w + 5;
      System.out.println(arys[3]);
}
}
}
