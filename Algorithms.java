import java.util.*;


public class Algorithms {

    int number = 50;

    public static void main(String[] args) {
	// write your code here
    //    jaggedArray();
    //    reverse_array();
        // reversingArrays();
        // new_jagged_array();
        Algorithms myObj = new Algorithms();

     

    }

    


    private static void findMin_Max_Value() {
        int[] myList = {2, 3, 10, 5, 17, 9, 8, -1, 13, 4};
        int maxElement = myList[0];
        int minElement = myList[0];

        for (int i = 1; i < myList.length; i++) {
            if (maxElement < myList[i]) {
                maxElement = myList[i];
                System.out.println("max: " + maxElement);
            }
            if (minElement > myList[i]) {
                minElement = myList[i];
                System.out.println("min: " + minElement);
            }
        }

        System.out.println("The largest value is: " + maxElement);
        System.out.println("The smallest value is: " + minElement);
    }

    private static void checkArrays() {
        int array1[] = {1, 3, 5, 8, 12};
        int array2[] = {1, 5, 8, 12, 15};
        int array3[] = {1, 3, 5, 8, 12};

        System.out.println("is array1 equal to array2? " + Arrays.equals(array1, array2));
        System.out.println("is array1 equal to array3? " + Arrays.equals(array1, array3));

    }

    private static void jaggedArray() {

//    create 2d array of 10 col and increasing number of rows
        int two_dim_arr [][] = new int[10][10];
        int cols = two_dim_arr.length;

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < i + 1; j++) {

                int new_row = (i) + (j);
                two_dim_arr[i][j] = new_row;

                System.out.print(new_row + "\t");
            }
            System.out.println();
        }

    }

    private static void reverse_array() {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};

//        reverse by storing in a new array
        double new_array[] =new double[7];


        for (int i = 0; i <= myArray.length - 1; i++) {

            myArray[i] = myArray[myArray.length - i - 1];

            System.out.println(myArray[i]);
//            save values into new array
            new_array[i] = myArray[i];


        }

        System.out.println(Arrays.toString(new_array));

//        reverse without new array

        for (int i = 0; i <= myArray.length+1; i++) {

            double store = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = store;

        }

        System.out.println(Arrays.toString(myArray));

    }

    private static void new_jagged_array() {
        int two_dim_arr [][] = new int[3][];
        two_dim_arr[0] = new int[3];
        two_dim_arr[1] = new int[5];
        two_dim_arr[2] = new int[8];
        two_dim_arr[2] = new int[12];
        two_dim_arr[2] = new int[15];
    


        int cols = two_dim_arr.length;

        int count  = 0;

        for (int i = 0; i < two_dim_arr.length; i++) {

            for(int j = 0; j < two_dim_arr[i].length; j++)
            {
                two_dim_arr[i][j] = count++;
                System.out.println(two_dim_arr[i][j]);
            }

        }
        for (int i = 0; i < two_dim_arr.length; i++) {
            
            for (int j = 0; j < two_dim_arr.length; j++) {
                System.out.println(two_dim_arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void reversingArrays() {
        double[] myArray = {8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0};
        double store = 0;
        double new_array[] =new double[7];
        // using a new Array
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.println("insert at index: " + (myArray.length-i-1));
            new_array[myArray.length-i-1] = myArray[i];
        }
        // System.out.println(store);
        System.out.println(Arrays.toString(new_array));

        // without using an array
        for(int i = 0; i < myArray.length / 2; i++) {
{
            store = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = store;
}
        }
       
        System.out.println(Arrays.toString(myArray));
    }


    private void linkedList() {
  

    }


    


}
