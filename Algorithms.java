import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
//        manage2DArray();
        reverse_array();
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

    private static void manage2DArray() {

//    create 2d array of 10 col and increasing number of rows
        int two_dim_arr [][] = new int[10][10];
        int cols = two_dim_arr.length;
//        int rows = two_dim_arr[0].length;

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < i + 1; j++) {

                int x = (i + 1) * (j + 1);
                two_dim_arr[i][j] = x;

                System.out.print(x + "\t");
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

        for (int i = 0; i <= myArray.length - 1; i++) {

            double store = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = store;



        }

        System.out.println(Arrays.toString(myArray));

    }


}
