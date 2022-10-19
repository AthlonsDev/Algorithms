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
        obj.mergeSort(arr2, 0, arr2.length - 1);
        // obj.merge(arr2, 12, 13, 7);
        obj.printArray(arr2, arr2.length);

    }

    void printArray(int data[], int n)  
    {  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(data[i] + " ");  
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

    //need to divide array in 2
    //find the mid value - the pivot
        // int mid = (low+high)/2;

        // // divide the array
        // int halfData = data.length/2;
        // // 1 from low to pivot the other from pivot to high
        // int arrayL[] = new int[halfData];
        // int arrayR[] = new int[data.length];
        // // insert values into arrays, array /2 so from first to mid value
        // for (int i = 0; i < halfData; i++) {
        //     arrayL[i] = data[i];
        //     // System.out.print(arrayL[i]);
        // }
        // // now array left is ok

        // for (int i = halfData; i < data.length; i++) {
        //     arrayR[i] = data[i];
        //     // System.out.print(arrayR[i]);

        // }

        if (low < high) {
            int mid = (low + high)/2;
            mergeSort(data, low, mid);  
            mergeSort(data, mid + 1, high);  
            merge(data, low, mid, high);
        }

    }

    public void sortMerge(int data[], int low, int mid, int high) {
        int i, j, k;  
        int n1 = mid - low + 1;    
        int n2 = high - mid;    
          
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2]; //temporary arrays  
          
        /* copy data to temp arrays */  
        for (int l = 0; l < n1; l++)    
        LeftArray[l] = data[low + l];    
        for (int m = 0; m < n2; m++)    
        RightArray[m] = data[mid + 1 + m];    

        i = 0; /* initial index of first sub-array */  
        j = 0; /* initial index of second sub-array */   
        k = low;  /* initial index of merged sub-array */  
          
        while (i < n1 && j < n2)    
        {    
            if(LeftArray[i] <= RightArray[j])    
            {    
                data[k] = LeftArray[i];    
                i++;    
            }    
            else    
            {    
                data[k] = RightArray[j];    
                j++;    
            }    
            k++;    
        }    
        while (i<n1)    
        {    
            data[k] = LeftArray[i];    
            i++;    
            k++;    
        }    
          
        while (j<n2)    
        {    
            data[k] = RightArray[j];    
            j++;    
            k++;    
        }    

        System.out.print(data[0]);
        // return data;

    }

    private void merge(int data[], int low, int mid, int high) {
        // if (low < high) {
        //     // find the number at the middle
        //     int mid = (high+low)/2;
        //     // function calls itself until the low is not lower than higher
        //     mergeSort(data, low, high);
        //     // instead of the lower value adds the number at right of the mid = lowest value from right
        //     mergeSort(data, mid+1, high);
        //     // Merge these values once again
        //     merge(data, low, mid, high);
        // }
    }

}