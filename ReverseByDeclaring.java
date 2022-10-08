import java.util.*;

public class ReverseByDeclaring {
    
    public static void main(String[] args) {

        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
        double new_array[] =new double[7];
        // using a new Array
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.println("insert " + i +" at index: " + (myArray.length-i-1));
            new_array[myArray.length-i-1] = myArray[i];
        }
        // System.out.println(store);
        System.out.println(Arrays.toString(new_array));
        
    }
}
