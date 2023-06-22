/*
💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */

import java.util.Arrays;

public class MoveZero {
    static void moveZeros(int num[]){
        int ptr = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[ptr] = num[i];
                ptr++;
            }
        }

        while (ptr < num.length) {
            num[ptr] = 0;
            ptr++;
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }    
}
