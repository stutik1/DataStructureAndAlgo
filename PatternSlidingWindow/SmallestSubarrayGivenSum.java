//Problem Statement #
//Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’

package PatternSlidingWindow;
public class SmallestSubarrayGivenSum {
    public static int smallestSubarray(int[] arr, int k){
       if(arr.length ==0 ){
        return 0;
     }
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum >= k ) {
                    minLength = Math.min(minLength, (j-i)+1);
                }
            }
        }
        return minLength;
    }
    public static void main(String[] args){
        int [] arr={2, 1, 5, 1, 3, 2};
        System.out.println(smallestSubarray(arr,3));
        System.out.println(smallestSubarray(arr,8));
        System.out.println(smallestSubarray(new int [] {2, 3, 4, 1, 5} , 4));
        System.out.println(smallestSubarray(new int [] {2, 3, 4, 1, 5,3} , 3));
    }
}
