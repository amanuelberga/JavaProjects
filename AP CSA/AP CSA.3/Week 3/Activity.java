public class Activity{
   public static String writeGaGaSong(String lyrics) {
  	if (lyrics.length() > 50) {
	    	return lyrics;
    	}
  	else if (lyrics.length() % 2 == 0) {
  		return writeGaGaSong(lyrics + " Bad romance...");
        	//15 characters long
  	}
  	else if (lyrics.length() % 3 == 0) {
  		return writeGaGaSong(lyrics + " GaGa ooh-la-la!");
  		//16 characters long
    	}
  	else if (lyrics.length() % 5 == 0) {
  		return writeGaGaSong(lyrics + " Ramama!");
  		//8 characters long
    	}
  	else {
  		return writeGaGaSong(lyrics + " Alejandro!");	
  		//11 characters long
    	}
  }
  public static boolean undecided(boolean firstChoice, boolean secondChoice) {
	if (firstChoice || secondChoice) {
		return secondChoice;	
    	}  
    	else {
		boolean a, b, c;
		a = undecided(firstChoice, !secondChoice);
		b = undecided(!firstChoice, secondChoice);
		c = undecided(!firstChoice, !secondChoice);
		return a && b && c;
	}	
}
   public static int strangeCountDown(int t, int minus) {
	if (t <= 0 && minus <= 0) {
		System.out.println("Blastoff!");
		return -1;
	} else {
		System.out.println("T: " + t + " Minus: " + minus);
		strangeCountDown(t / 2, minus - t / 4);
      return minus;
	}
}
public static String zoo(String str) {
    if (str.substring(0,1).equals("X") || str.length() == 2) return str.substring(1);
    return zoo(str.substring(1));
}
   public static void main(String [] args){
      System.out.println(strangeCountDown(64,5));
      String s = "panda";
      System.out.println(zoo("xOXox"));
   }
}