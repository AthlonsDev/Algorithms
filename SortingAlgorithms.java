import java.util.*;

class SortingAlgorithms {


    public static void main(String[] args) {
        
        SortingAlgorithms obj = new SortingAlgorithms();

        // init an array
       int myArray[] = {5, 8, 6, 4 ,1, 3, 10, 2, 9, 7};

    //    int[] sortedArray = obj.BubbleSort(myArray);

        // System.out.print(Arrays.toString(sortedArray));

        // Sort by Bubble Sort - O(n^2)
        obj.BubbleSort(myArray);

        // can find lowest and highest numbers after sorting lowest will be at 0 and highest at 9

//      Sort by Merge Sort - O(n log n)
        obj.mergeSort(myArray, 1, 10);

    }

    public void mergeSort(int data[], int low, int high) {

        if (high > low) {
            int medium = (high+low)/2;
            mergeSort(data, low, high);
            mergeSort(data, medium+1, high);

            // Merge(data, low, medium, high);
        }


    }

    public void BubbleSort(int data[]) {

        int temp;
        boolean isSwapped;
        for (int i = 0; i < data.length; i++) {
            isSwapped = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                    if(data[j] > data[j+1]) {
                        temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                        isSwapped = true;
                        // System.out.println(data[i]);
                    }
            }
            if(isSwapped = false)
                break;
        }
        System.out.print(Arrays.toString(data));
        // return data;
    }

}