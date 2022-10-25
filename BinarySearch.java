import java.util.Scanner;

public class BinarySearch {
    
    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();
        
        int array[] = {1, 2, 3, 5, 6, 7 ,8};

        int low = 0;
        int high = array.length-1;
        int target = array.length-1;

        obj.Binary(array, low, high, target);


    }

    private void Binary(int[] array, int low, int high, int target) {

        int mid = (low+high)/2;

        // The target matches the index/mid number
        if(array[mid] == target) {
            System.out.println("Index Found! " + array[target] + " is at index " + array[mid]);
        }
        else {
            // target bigger than mid number = so look in the right side
            if (target > array[mid]) {
                Binary(array, mid+1, high, target);
            }
            // target is smaller than mid number so will look in the left side
            else {
                Binary(array, low, mid-1, target);
            }
        }

    }
}
