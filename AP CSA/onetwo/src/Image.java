/**
A class called Image is provided below. This class can be used to manage a two-dimensional array of pixels.
The basic class structure has been defined for you, with one instance variable: pixels, that stores a set of 
hexadecimal color values as a two-dimensional array of Strings, and several helper methods that manipulate the 
data as needed. The constructor initializes the pixels array for you, but you will need to create the new String array.
You must complete the constructor, and define one method:  filterRed().
As usual, the items we want you to complete are described in "TODO" comments. Anything not specificed by these 
comments (anything outside of the filterRed() method and Image constructor) should be left as is. If you accidentally
 change something, you can always reset your assignment.
For the constructor, write a single statement that reserves new memory for a two-dimensional String array, pixels.
In the filterRed method, you should iterate through all of the individual pixels, checking each using the
 mostlyRed method to determine if the red portion of the hex color string should be zeroed out. If the pixel
  is mostly red, store a new String in that pixel location made up of "00" for red, and the current green and blue components of the given pixel.
Ex.  pixels[10][127] = "FF1A48";  // before method call
    pixels[10][127] = "001A48";  // after method call
filterRed changes the pixel at location row=10, column=127, because the amount of red ("FF", i.e., 255)
 is bigger than the amount of green ("1A" -> 26) and the amount of blue ("48" -> 72). The amount of red ("FF") is
  replaced by two zeros ("00") and the green and blue are appended on to that String.
**/
import java.util.Random;

public class Image {
  String[][] pixels;

  public Image(int width, int height) {
    /*** TODO: Create an empty two-dimensional String array, with height rows
               and width columns ***/
   pixels = new String[width][height];
   
   loadPixels();
  }

  public void filterRed() {
    /*** TODO: Iterate over every String element in pixels
               If element is mostly red, set red to "00", do not change green or blue ***/
   for(int i=0;i<pixels.length;i++){
      for(int j=0;j<pixels[i].length;j++){
         if(mostlyRed(pixels[i][j])==true){
         String temp="";
         for(int k=0;k<2;k++)
         {
         
         temp+="0";
         }
         temp+=pixels[i][j].substring(2);
         
          pixels[i][j]=temp;
         }
      }
   
   } 
   
   
   
  }

  public void loadPixels() {
    /*** initialization of pixels is not shown
         data stored as hexadecimal color string, i.e. "C28E0E" ***/
    Random r = new Random();
    for (int i = 0; i < pixels.length; i++) {
      for (int j = 0; j < pixels[i].length; j++) {
        pixels[i][j] = makeHex(r.nextInt(256)) + makeHex(r.nextInt(256)) + makeHex(r.nextInt(256));
      }
    }
  }

  public String makeHex(int x) {
    String s = Integer.toHexString(x);
    if (s.length() < 2) s = "0" + s;
    return s;
  }

  public boolean mostlyRed(String p) {
    int r = hexToDecimal(p.substring(0,2));
    int g = hexToDecimal(p.substring(2,4));
    int b = hexToDecimal(p.substring(4));
    return (r > g && r > b);
  }

  public int hexToDecimal(String hex) {
    char first = hex.charAt(0);
    char second = hex.charAt(1);
    int dec = (int)((first < 65) ? (first - 47) : (first - 65)) * 10;
    dec = dec + (int)((second < 65) ? (second - 47) : (second - 65));
    return dec;
  }

  public String toString() {
    String s = "<html><head></head><body><table style='border-collapse: collapse; padding: 0px;'>";
    for (int i = 0; i < pixels.length; i++) {
      s = s +  "<tr>";
      for (int j = 0; j < pixels[i].length; j++) {
        s = s + "<td style='height: 1px; width: 1px; background-color: #" + pixels[i][j] + ";'></td>";
      }
      s = s + "</tr>";
    }
    s = s + "</table></body></html>";
    return s;
  }

  public static void main(String[] args) {
    Image img = new Image(10,12);
    System.out.println("<html><head></head><body>Before Filter</body></html>");
    System.out.println(img);
    img.filterRed();
    System.out.println("<html><head></head><body>After Filter</body></html>");
    System.out.println(img);
  }
}
