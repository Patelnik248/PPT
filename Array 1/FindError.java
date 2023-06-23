/*
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

 */

import java.util.Arrays;

public class FindError {

    static int[] missingNumber(int num[]){
        Arrays.sort(num);
        int n=num.length;
        int duplicate=0;
        int sum=0;
        int expectedSum=n*(n+1)/2;
        for(int i=0;i<num.length-1;i++){
            sum+=num[i];
            if(num[i]==num[i+1])
                duplicate=num[i];
        }
        sum+=num[num.length-1];
        int missingNumber = expectedSum-sum + duplicate;
        return new int[]{duplicate,missingNumber};
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        System.out.println(Arrays.toString(missingNumber(nums)));
    }    
}
