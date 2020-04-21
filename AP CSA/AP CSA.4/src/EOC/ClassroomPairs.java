package EOC;

public class ClassroomPairs{
    public static String studentPair(String a, String b){
        return a+", "+b;
    }
    public static boolean canPair(String [][] classroom){
        if((classroom[0].length*classroom.length)%2==0){return true;}
        return false;
    }
    public static String [] classPairs(String [][] classroom){
        String [] m = new String[classroom.length/2];
        for(int i=0; i<classroom.length; i++){
            for(int j=0; j<classroom[i].length; j++){

                    if(j==classroom[i].length-2){
                        studentPair(classroom[i][j], classroom[i+1][j]);
                    }else if(j>classroom[i].length-1){
                        studentPair(classroom[i][j], classroom[i][j+1]);
                    }

            }
        }
        return m;
    }
    public static void main(String [] args){
        String [][]a = {{"a","b"},{"c","d"},{"e"},{"f", "h"}};
        System.out.println(classPairs(a));
    }
}