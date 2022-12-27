import java.util.Arrays;
import java.util.regex.*;
import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int[] lines = {3,2,2,3};
        // System.out.println(strStr("sadbutsat", "but"));
        String s = "pwwkew";
        // System.out.println(lengthOfLongestSubstring(s));
        String roman = "III";
        // romanToInt(roman);

        String words[] = {"aabb","ab","ba"};
        // similarPairs(words);
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        // get length of int using logarithm
        
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();

        System.out.println(s);
        System.out.println(rev);

        if (s.equals(rev)) {
            return true;
        }
        else{
            return false;
        }

    }

    public static int romanToInt(String s) {
        
        HashMap <Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        int count = 0;
        map.get(1);
        for (int i = 0; i < s.length(); i++) {
            if(map.containsValue(s.charAt(i))) {
               System.out.println(map.get('I'));

            }
        }
        
        return count;
    }

    public static int similarPairs(String[] words) {
        
        int count = 0;
        HashMap <Integer,Character> map = new HashMap<Integer, Character>();
        for (int i = 0; i < words.length-1; i++) {
            if (!(map.containsValue(words[i].charAt(i)))) {
                map.put(i, words[i].charAt(i));
            }
            System.out.println(words[i+1]);
            if (map.containsValue(words[i+1].charAt(i))) {
                // System.out.println(map.get(i));
                count++;
            } 
        }

        System.out.println(count);
        return count;
    }

    public static int lengthOfLongestSubstring(String s) {
        // it works but not substring
        int count = 1;
        String temp = "";
        HashMap <Integer,Character> map = new HashMap<Integer, Character>();
        // temp = s.codePointAt(count)
        map.put(0, s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if(!(map.containsValue(s.charAt(i)))) {
                // System.out.println(s.charAt(i));
                // count++;
                temp = temp.substring(i);
                System.out.println(temp);
            }
            map.put(i, s.charAt(i));
        }

        if(s.contains(temp)) {
            count = temp.length();
        } else{
            count = temp.length()-1;
        }
        System.out.print(temp);
        return count;
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
