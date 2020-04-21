package BubbleSort;

public class Family {
    public static void main(String [] args){
        int temp;
        int [] age = new int [6];
        age[0]=37;
        age[1] = 21;
        age[2]=43;
        age[3] = 3;
        age[4] = 2;
        age[5] = 9;
        //age[6] = 34;
        for(int i=0; i<age.length; i++){
            for(int j=0; j<age.length-1; j++){
                if(age[j]>age[j+1]){
                    temp=age[j];
                    age[j] = age[j+1];
                    age[j+1] = temp;
                }

                System.out.print(" "+age[j]+" ");
            }
            System.out.println();
        }
    }
}
