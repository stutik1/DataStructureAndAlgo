//Problem Statement #
//Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
package Pattern_Sliding_Window;
public class MaximumSumSubarrayofSizeK {
    public static int maximumSumSubArrayBruteForce(int[] arr,int k) {
        if (arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        int sum = 0;
        int max_sum = 0;

        for (int i = 0; i < arr.length - k; i++) {
            sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
        ///// method 2 ////////

         public static int maximumSumSubArrayofSizeK(int[] arr,int k) {
           if(arr.length==0 || k <=0 || k>arr.length ){
                    return 0;
                }
        int sum=0;
        int start=0;
        int max_sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max_sum = sum;//
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
        System.out.println(maximumSumSubArrayBruteForce(arr,3));
        System.out.println(maximumSumSubArrayBruteForce(arr,2)); //
        System.out.println(maximumSumSubArrayBruteForce(new int [] {2, 3, 4, 1, 5} , 2));
        System.out.println(maximumSumSubArrayBruteForce(new int [] {2, 3, 4, 1, 5,3} , 3));
    }
}


