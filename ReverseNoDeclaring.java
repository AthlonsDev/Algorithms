import java.util.*;

public class ReverseNoDeclaring {
    
    public static void main(String[] args) {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
        double store = 0;

         // without using an array
         for(int i = 0; i < myArray.length / 2; i++) 
         {
            {
                store = myArray[i];
                myArray[i] = myArray[myArray.length - i - 1];
                myArray[myArray.length - i - 1] = store;
            }
        }
                   
            System.out.println(Arrays.toString(myArray));
        }
        
}

