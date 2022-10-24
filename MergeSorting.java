import java.util.Arrays;

public class MergeSorting {
    

    public static void main(String[] args) {
        
        int array[] = { 12, 11, 13, 5, 6, 7 };
        int length = array.length;

        MergeSorting obj = new MergeSorting();
        obj.mergeSort(array, 0, length - 1);
        System.out.println("Sorted Array"); 
        obj.PrintAll(array, length);



    }

    private void PrintAll(int array[], int length) {
        int i;
        for (i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void mergeSort(int array[], int first, int last) {
        //as long as the first number is less than th elast all this code will run
        if (first<last) {
            // finds the exact middle of the array
            int mid = (first+last)/2;
            // first half of the array
            mergeSort(array, first, mid);
            // second half of the array
            mergeSort(array, mid+1, last);
            // creates temp arrays, sorts and merges them
            merge(array, first, mid, last);

        }
    }

    public void merge(int array[], int first, int mid, int last) {

        // indexes of arrays
        int i, j, k;
        // size of first half
        int l1 = mid - first + 1;
        // size of second array
        int l2 = last - mid;

        // temp arrays
        int LeftArray[] = new int[l1];
        int rightArray[] = new int[l2];

        // insert data into the temp arrays
        for (i = 0; i < l1; i++) {
            LeftArray[i] = array[first + i];
        }
        for (j = 0; j < l2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }
        // initial index of left array
        i = 0;
        // initial index of right array
        j = 0;
        // initial index of the merged array
        k = first; 

        // sorting and merging the arrays
        // while the index are less the the size of the arrays
        while (i < l1 && j < l2) {
            // if the corresponding index of leftarray is less or equalto the right array
            if (LeftArray[i] <= rightArray[j]) {
                // insert the number at left to index of merged array
                array[k] = LeftArray[i];
                // increase index temp array left
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            // increase index sorted array
            k++;
        }
        // in case only i < size left array
        while (i<l1) {
            array[k] = LeftArray[i];
            i++;
            k++;
        }
        // in case only j < size right array
        while (j<l2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }
}
