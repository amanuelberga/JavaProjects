package Sorts;
import java.util.ArrayList;

public class Bubble {
    public static void main(String [] args){
        int [] ar= {4,5,5,34,3,123,1,5,6,7,45,12};
        for (int i = (ar.length - 1); i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (ar[j-1] > ar[j])
                {
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
                //System.out.print(ar[j]+" ");
            }
           // System.out.println();
        }

        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}

