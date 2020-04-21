class StaticDemo
{
  int changer(int y)
  {
    y = 10;
    return y;
  }

  public static void main(String args[])
  {
    StaticDemo s1 = new StaticDemo();
    int y = 12;
    System.out.print("y is: " + s1.changer(y));
    System.out.println(" , y is: " + y);
  }
}