public class Apartment {
    public static int rentors;
    private String address;
    private int aptNum;
    
    /** Rest of class definition not shown **/
    
    public static void main(String[] args) {
        Apartment a1 = new Apartment();
        Apartment a2 = new Apartment();
        Apartment a3 = new Apartment();
     	a1.rentors++;
      a2.rentors++;
        System.out.println(a2.rentors);
        a3.rentors++;
        a3.rentors--;
    }
}