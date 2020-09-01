package leetcode1.day02;

import java.util.ArrayList;
import java.util.Arrays;


public class demo01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{9, 9, 9});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    static class Solution {
        public int[] plusOne(int[] digits) {
            int[] array = addOne(digits, digits.length);
            return array;
        }
        public int[] addOne(int[] array, int p){
            if(p <= 0){
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                for(int i = 0; i < array.length; i++){
                    newArray[i + 1] = array[i];
                }
                return newArray;
            }
            if(array[p - 1] < 9){
                array[p - 1]++;
                return array;
            }else{
                array[p - 1] = 0;
                return addOne(array, p - 1);
            }
        }
    }
}
