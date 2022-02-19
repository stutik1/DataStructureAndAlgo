package PatternTwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PairWithTargetSum {
    public static void targetSum(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target ){
                    System.out.println("pair found " + arr[i] + "," + arr[j]);
                }
            }
        }
    }

    public static void targetSumByTwoPointers(int arr[], int target){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            if(arr[low] + arr[high] == target){
                System.out.println("pair found " + arr[low] + "," + arr[high]);
            }
             if(arr[low] + arr[high] < target){
                low++;
            }
            else  {
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2, 3,4,5};
        int target = 5;
       //targetSum(arr,target);
        targetSumByTwoPointers(arr,target);
    }
}
