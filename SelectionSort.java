import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();

        int array[] = {10, 33, 28, 5, 63, 224, 6978, 96, 57};

        obj.SelectionSort(array);
        
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
}
