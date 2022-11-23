import java.util.Arrays;
import java.util.regex.*;
import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int[] lines = {3,2,2,3};
        System.out.println(strStr("sadbutsat", "but"));
    }

    public static int strStr(String haystack, String needle) {
        
        for (int i = 0; i < haystack.length(); i++) {
            if( haystack.contains(needle)) {
                if(haystack.startsWith(needle)) {
                    return 0;
                }
                else if (haystack.endsWith(needle)) {
                    int index = haystack.indexOf(needle);
                    return index;
                }
                else if(haystack.contains(needle)) {
                    int index = haystack.indexOf(needle);
                    return index;
                }
            }
            else {
                return -1;
            }

            
        }

        return 100;
    }

    public static int removeElement(int[] nums, int val) {
        // Arrays.sort(nums);
        // solve with arraylist
//         ArrayList <Integer> list = new ArrayList<>();
//         for(int i = 0; i<nums.length;i++) {
            
//             if(nums[i] != val) {
// //                 remove number from array
// //                 move it to the end of array
//                 // nums[i] = nums[nums.length-1];
//                 list.add(nums[i]);
                
//             }
            
//         }

//         System.out.print(list);

//         return list.size();
// solve in-place
        int store = 0;
        
        for(int i = 0; i<nums.length;i++) {
    
            if(nums[i] != val) {
                store++;
            }

        }

        // System.out.print(Arrays.toString(nums));
        return store++;
        
    }
    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer> list = new ArrayList<>();
        int result = 0;
        list.add(nums[0]);
        for (int i =1; i < nums.length; i++) {
 

            System.out.println(i-1);
            if(!(nums[i-1] == nums[i])) {
                list.add(nums[i]);
            }
        }
        System.out.println(list);
        result = list.size();
                
        return result;
    }
}
