public class Give{
  public static int getQuarters(int p){
    int q = p/25;
    return q;
  }
  public static int getDimes(int p, int q){
    int d = (p%25)/10;
    return d;
  }
  public static int getNickles(int p, int q, int d){
    int n = (p-(q*25+d*10))/5;
    return n;
  }public static int getPennies(int p, int q, int d, int n){
    return (p-(q*25+d*10+n*5));
  }
  public static void main(String[] args){
    int pennies = 197;
    int q = getQuarters(pennies);
    int d = getDimes(pennies, q);
    int n = getNickles(pennies, q, d);
    int p = getPennies(pennies, q, d, n);

  }
}
