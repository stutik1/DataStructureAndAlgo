//Problem Statement #
// Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

package PatternTwoPointers;

public class TripleSumToZero {
    public static void tripleSumToZeroByBruteForce(int[] arr,int sum){
        for (int i=0;i< arr.length-2;i++){
            for (int j=i+1;j< arr.length-1;j++){
                for (int k=j+1;k< arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,-1, 1 ,2, -3};
       // int arr[] = {0,-1, 2, -3};
        tripleSumToZeroByBruteForce(arr,0);

    }
}
