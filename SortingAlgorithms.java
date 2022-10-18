import java.util.*;

class SortingAlgorithms {


    public static void main(String[] args) {
        
        SortingAlgorithms obj = new SortingAlgorithms();

        // init an array
        int arr[] ={93,42,51,3,455,20,5,100,5487,87,96,21};

    //    int[] sortedArray = obj.BubbleSort(myArray);

        // System.out.print(Arrays.toString(sortedArray));

        // Sort by Bubble Sort - O(n^2)
        // obj.BubbleSort(arr);

        int array[] = {10, 33, 28, 5, 63, 224, 6978, 96, 57};
        // sort by Selection Sort - O(n^2)
        // obj.SelectionSort(array);

        // can find lowest and highest numbers after sorting lowest will be at 0 and highest at 9

        int arr2[] = { 12, 11, 13, 5, 6, 7 };
//      Sort by Merge Sort - O(n log n)
        // obj.mergeSort(arr2, 5, 13);
        obj.merge(arr2, 12, 13, 7);

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

    public void SelectionSort(int data[]) {
        int min;
        for (int i = 0; i < data.length; i++) {
            // Assumes first element at [0] is the minimum element
            min = i;
            // loops past the first element
            for (int j = min+1; j < data.length; j++) {
                // if any element is smaller the first/presumed minimum
                if(data[j] < data[min]) {
                    // this element is now the new minimum element
                    min = j;
                    
                }
                
            }
            // if min not equal to index
            if(min != i) {
                // save each number in temporary value
                int temp = data[i];
                // each new value is saved in the sorted collection
                data[i] = data[min];
                // adds new value to the sorted collection
                data[min] = temp;
            }
        }
        System.out.print(Arrays.toString(data));
    }

    public void mergeSort(int data[], int low, int high) {

        if (low < high) {
            // find the number at the middle
            int mid = (high+low)/2;
            // function calls itself until the low is not lower than higher
            mergeSort(data, low, high);
            // instead of the lower value adds the number at right of the mid = lowest value from right
            mergeSort(data, mid+1, high);
            // Merge these values once again
            merge(data, low, mid, high);
        }


    }

    private void merge(int data[], int low, int mid, int high) {
        // difference between mid and low value and mid and high
        int n1 = mid - low - 1;
        int n2 = high - mid;

        // temp arrays
        int leftArray[] = new int[12];
        // int rightArray[] = new int[n2];

        // insert data into temp arrays
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = data[low + i];
            System.out.print(leftArray[i]);
        }
        // System.out.println("");
        // for (int i = 0; i < n2 -1; i++) {
        //     rightArray[i] = data[mid + i];
        //     System.out.print(rightArray[i]);
        // }
    }

}