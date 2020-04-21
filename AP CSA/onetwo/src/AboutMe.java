public class AboutMe{
  public String myName(){
    return "Amanuel";
  }
  public int myAge(){
    return 14;
  }
  public String mySchool(){
    return "Renton High School";
  }
  public static void main(String[] args){
    AboutMe ae = new AboutMe();
    String n = ae.myName();
    int a = ae.myAge();
    String s = ae.mySchool();
    System.out.println("My name is " + n + " ,and I attend " + s + ". I am " + a + " years old.");
    System.out.println((int)Math.pow(5,2));
    char c = 'z';
    System.out.println(c);
    String p = "Keep up the good work!";
    int x = p.compareTo("Leep");
    System.out.println(x);



  }
}