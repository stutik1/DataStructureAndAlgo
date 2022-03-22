//Problem Statement #
//Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.

package PatternTwoPointers;

import java.util.Arrays;

public class CountTripletsWithSmallerSum {
    public static int tripletsWithSmallerSum(int arr[],int sum){
        int result = 0;
        for(int i=0;i< arr.length-2;i++){
            for (int j=i+1;j< arr.length-1;j++){
                for (int k=j+1;k< arr.length;k++){
                   if (arr[i]+arr[j]+arr[k]<sum){
                       result++;
                   }
                }
            }
        }
        return result;
    }

    public static int tripletsWithSmallerSumByTwoPointer(int arr[],int sum){
        Arrays.sort(arr);
        int ans =0;
        for (int i=0;i< arr.length-2;i++){
            int start =i+1;
            int end = arr.length-1;
            while (start <end){
                if (arr[i]+arr[start]+arr[end]>=sum){
                   end--;
                }
                else{
                    ans= ans+(end-start);
                    start++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={-1, 4, 2, 1, 3};
        int sum =5;
        System.out.println(tripletsWithSmallerSum(arr,sum));
        System.out.println(tripletsWithSmallerSumByTwoPointer(arr,sum));

        System.out.println(tripletsWithSmallerSum(new int[] {-1, 0, 2, 3},3));
        System.out.println(tripletsWithSmallerSumByTwoPointer(new int[] {-1, 0, 2, 3},3));


    }
}
