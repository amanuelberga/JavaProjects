
public class G {

  /** @param p number of pennies
  *   @return number of quarters
  */
  public static int getQuarters(int p) {
   //TODO: method definition for getQuarters
    int q = p/25;
    p%=25;
     
    return q;
   
   
  }

  /** @param p number of pennies
  *   @param q number of quarters
  *   @return number of dimes
  */
  public static int getDimes(int p, int q) {
   //TODO: method definition for getDimes
    int d = (q-p)/10;
     d %= (q-p)%10;
    return d;
   
   
   
  }

  /** @param p number of pennies
  *   @param q number of quarters
  *   @param d number of dimes
  *   @return number of nickels
  */
  public static int getNickels(int p, int q, int d) {
   //TODO: method definition for getNickels
   int n = ((q-p)/10)/5;
   n %= ((q-p)/10)/5;
   return n;
   
   
   
  }

  /** @param p number of pennies
  *   @param q number of quarters
  *   @param d number of dimes
  *   @param n number of nickels
  *   @return number of leftover pennies
  */
  public static int getPennies(int p, int q, int d, int n) {
   //TODO: method definition for getPennies
   return p;
   
   
   
  }

  public static void main(String[] args) {
    int pennies = 197;
    int q = getQuarters(pennies);
    int d = getDimes(pennies, q);
    int n = getNickels(pennies, q, d);
    int p = getPennies(pennies, q, d, n);

  }

}
