import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] ={93,42,51,3,455,20,5,100,5487,87,96,21};
        BubbleSort obj = new BubbleSort();
        System.out.println("Sorted Array ");
        obj.BubbleSort(array);
        obj.PrintAll(array, array.length);

    }

    public void BubbleSort(int data[]) {

        int temp;
        boolean isSwapped;
        for (int i = 0; i < data.length; i++) {
            // init boolean variable a false
            isSwapped = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                // check which number is bigger and perform the swap
                    if(data[j] > data[j+1]) {
                        temp = data[j+1];
                        data[j+1] = data[j];
                        data[j] = temp;
                        isSwapped = true;
                    }
            }
            if(isSwapped = false)
                break;
        }
    }

    private void PrintAll(int array[], int length) {
        int i;
        for (i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



