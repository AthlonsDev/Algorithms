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

        int array[] = {4,3,1,1,3,3,2};
        // System.out.println(myObj.solution(array));
        int[] bloomday = {1,10,3,10,2};
        int m = 3, k = 1;
        // myObj.minDays(bloomday, m, k);
        int array1[] = {2,7,11,15};
        // int[] sum = myObj.twoSum(array1, 9);
        // System.out.println(Arrays.toString(sum));
        // myObj.stepsPerCost();
        simpleArraySum();
        List<Integer> a = new ArrayList<Integer>(3);
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<Integer>(3);
        b.add(3);
        b.add(2);
        b.add(1);

        compareTriplets(a, b);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore = 0;
        int bScore = 0;
         ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<a.size(); i++) {
            if (a.get(i)>b.get(i)) {
                aScore++;
            }
            if (a.get(i)<b.get(i)) {
                bScore++;
            }
        }
        list.add(aScore);
        list.add(bScore);
        System.out.println(list);
        return list;
    }

    public static void simpleArraySum() {
        int[] ar = {1, 2, 3, 4, 10, 11};
        // Write your code here
        int result = 0;
        for (int i : ar) {
            result += i;
            System.out.println(result);
        }
       
    }

    public void stepsPerCost() {
        int[] cost = {10, 15, 20};
        int last = 0;
        int[] result =  new int[cost.length]; 
        
        // take last number compare it to next number
        int[] newCost = reverseArray(cost);
        if(newCost[newCost.length-1] < newCost[newCost.length]) {
            result[0] = newCost[newCost.length-1];
            for (int i = 1; i < newCost.length; i+=2) {
                try {
                result[i] = newCost[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    // TODO: handle exception
                    System.out.println(Arrays.toString(result));
                }
            }
        }

        


        // if next number is smaller than previous

        // compare it to next skipping one index

        // if no more numbers are available - return

    }

    public int[] reverseArray(int[] myArray) {
        int[] new_array =new int[myArray.length];
        // using a new Array
        for (int i = myArray.length-1; i >= 0; i--) {
            // System.out.println("insert " + i +" at index: " + (myArray.length-i-1));
            new_array[myArray.length-i-1] = myArray[i];
        }
        // System.out.println(store);
        // System.out.println(Arrays.toString(new_array));
        return new_array;
    }

    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      int[] result = new int[2];
      for (int i = 0; i < n; i++) {
        if(map.containsKey(target-nums[i])){
            System.out.println(nums[i]);
            result[1] = i;
            result[0] = map.get(target-nums[i]);
            System.out.println(result[0]);
            System.out.println(result[1]);
            return result;
        }
        map.put(nums[i], i);
      }
      return result;

    }
    

    public int minDays(int[] bloomDay, int m, int k) {
        // m = numerb of buquets to make
        // k = how many flowers in a buquets
        // number of days to make a m buquets
        int d = 0;
        



        return d;
    }

    public void findLeastNumOfUniqueInts(int[] arr, int k) {
        int[] temp = new int[arr.length];
        int result = 0;
        int toRemove = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
            }
            System.out.println(map.get(arr[2]));

            for (int i = 0; i < arr.length; i++) {
                if (!(map.get(arr[i]) < 2)) 
                    temp[i] = arr[i];
  
            }
            for (int i = 1; i < arr.length; i++) {
                // finds duplicates
                if (temp[i] != temp[i-1]) {
                    toRemove++;
                } 
                
                // find zeros
                if(temp[i] == 0) {
                    toRemove++;
                }
                result = temp.length - toRemove;
            }
            System.out.println(Arrays.toString(temp));
            System.out.println(result);

        }

    boolean solution(int[] sequence) {
    
        int[] temp = new int[sequence.length];
        boolean flag = false;
        Arrays.sort(sequence); 
        System.out.println(Arrays.toString(sequence));
        
        for (int i = 1; i < sequence.length; i++) {
            temp[i] = sequence[i];
            System.out.println("temp: " + temp[i]);
            System.out.println("sequence: " + sequence[i]);

            if(!(temp[i-1]<sequence[i])) {
                    return false;
                }
                flag = true;
            }

            // for (int j = 0; j < sequence.length; j++) {

            //     if(temp[i]>sequence[j]) {
            //         return false;
            //     }
            //     flag = true;
        return flag;
        
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
