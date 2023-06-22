/*Q1.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 You can return the answer in any order.
Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]*/

import java.util.Arrays;

public class SumOfTwoNumber{
    
    static int[] sumOfIndex(int a[], int target){
        int []x = new int[2];
        int l=0;
        int r=a.length-1;
        while(l<r){
            int sum =a[l]+a[r];
            if(sum==target){
                x[0]=l;
                x[1]=r;
                break;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        
        return x;
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        int result[]=sumOfIndex(nums,target);
        System.out.println(Arrays.toString(result));

    }
}