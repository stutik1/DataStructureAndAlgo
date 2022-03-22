// Problem:
// Write a function to return the list of all such triplets instead of the count. How will the time complexity change in this case?

package PatternTwoPointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {
    public static void tripletsWithSmallerSum(int []arr,int sum){
        for (int i=0;i< arr.length-2;i++){
            for (int j=i+1;j< arr.length-1;j++){
                for (int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] < sum){
                        System.out.println(arr[i]+"," + arr[j]+"," + arr[k] );
                    }
                }
            }
        }
    }

    public static void tripletsWithSmallerSumByTwoPointer(int arr[] ,int sum){
        Arrays.sort(arr);

        for (int i=0;i<arr.length-2;i++){
        int start =i+1;
        int end = arr.length-1;

        while (start<end){
            if (arr[i]+arr[start]+arr[end] < sum){
                start++;
            }
            else {
                System.out.print("(" + arr[i]+"," + arr[start]+"," + arr[end] + ")");
                end--;
            }
        }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, 4, 2, 1, 3};
       tripletsWithSmallerSum(arr,5);


        tripletsWithSmallerSumByTwoPointer(arr,5);
    }
}
