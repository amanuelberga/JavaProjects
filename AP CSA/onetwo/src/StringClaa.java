public class StringClaa {
     public static void main(String[] args) {
          String s1, s2;
          int length;
          char c1, c5;

          /*** TODO: Create a new String, s1, that contains "West Lafayette, Indiana, USA".
                     Store the length of s1 in the integer variable "length".
                     Store the character in position 1 of s1 in the character variable "c1".
                     Store the character in position 5 of s1 in the character variable "c5".
                     Store a new String in s2 which is composed of the concatenation of c1 and c5.
                     You should use methods of the String class to obtain the values for length, c1, and c5
                     You will not get full points if you "hard code" these values (ie: length = 28; )
          ***/
       s1 = "West Lafayette, Indiana, USA";
       char[]array= s1.toCharArray();
       length=s1.length();
       c1 = array[1];
       c5 = array[5];
       s2 = Character.toString(c1).concat(Character.toString(c5));
       



          /*** DO NOT edit the print statements below ***/
          System.out.println("The string \"" + s1 + "\" is " + length + " characters long.");
          System.out.println("Character 1 of s1 is '" + c1 + "' and character 5 is '" + c5 + "'.");
          System.out.println("The new string s2 is \"" + s2 + "\".");
     }
}
