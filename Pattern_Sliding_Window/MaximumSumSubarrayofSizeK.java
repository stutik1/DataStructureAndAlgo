package Pattern_Sliding_Window;
//Problem Statement #
//Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

public class MaximumSumSubarrayofSizeK {
    public static int SubArray(int[] arr,int k) {
        int sum=0;
        int start=0;
        int max_sum=0;

        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max_sum = sum;
        for(int j=k;j<arr.length;j++){
            sum = sum + arr[j] - arr[start];
            start++;
            if(sum>max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        int [] arr={2, 1, 5, 1, 3, 2};
        System.out.println(SubArray(arr,3));
        System.out.println(SubArray(arr,2));
        System.out.println(SubArray(new int [] {2, 3, 4, 1, 5} , 2));
        System.out.println(SubArray(new int [] {2, 3, 4, 1, 5} , 3));
    }
}
////