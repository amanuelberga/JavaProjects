import java.util.Scanner{

public class WordScore {

  int scrabbleScore;
  String word;
  WordScore(String word) {
    this.word = word.toLowerCase();
    this.scrabbleScore = getScrabbleScore();
  }
  public  int scrabbleLetterValue(char tile) {
    switch(tile) {
      case 'a':case 'e':case 'i':case 'l':case 'n':case 'o':case 'r':case 's':case 't':case 'u':
        return 1;
      case 'd':case 'g':
      	return 2;
      case 'b':case 'c':case 'm':case 'p':
      	return 3;
      case 'f':case 'h':case 'v':case 'w':case 'y':
      	return 4;
      case 'k':
      	return 5;
      case 'j':case 'x':
      	return 8;
      case 'q':case 'z':
      	return 10;
      default:
      	return -1;
    }
  }

  public int getScrabbleScore() {
   int total = 0;
   for(int i = 0; i<word.length(); i++){ 
      total = total + scrabbleLetterValue(word.charAt(0+i));
   }
   return total;
  }
 
  public static void main(String[] args) {
  	Scanner read = new Scanner(System.in);
    WordScore ws;
    while (read.hasNextLine()) {
      ws = new WordScore(read.nextLine());
      System.out.println(ws.getScrabbleScore());
    }
  }
}
