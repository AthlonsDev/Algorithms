import java.util.*;

public class JaggedArray {

    public static void main(String[] args) {
        
    int myArray[][] = new int[][] {
        {1},
        {2, 3},
        {4, 5, 6},
        {7, 8, 9, 10},
        {11, 12, 13, 14},
        {15, 16, 17, 18, 19},
        {20, 21, 22, 23, 24, 25},
        {26, 27, 28, 29, 30, 31, 32},
        {33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49},
    };

    int count = 1;
    
    for (int row = 0; row < myArray.length; row++)
        for (int col = 0; col < myArray[row].length; col++)
        myArray[row][col] = count++;

        for (int rows = 0; rows < myArray.length; rows++) {
            for (int col = 0; col < myArray[rows].length; col++)
                System.out.print(myArray[rows][col] + " ");
                System.out.println();
        }

    }
}
