package PatternTwoPointers;

import java.util.Arrays;

public class QuadrupleSumToTarget {
    public static void QuadrupleSumToTargetByBruteForce(int []arr,int target){
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                for (int k = j + 1; k < arr.length - 1; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l]== target) {
                            System.out.println(arr[i] + "," + arr[j] + "," + arr[k] + "," + arr[l]);
                        }
                    }
                }
            }
        }
    }

    public static void QuadrupleSumToTargetByTwoPointer(int arr[], int target){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-3;i++){
            for (int j=i+1;j<arr.length-2;j++){
                int sum = target-(arr[i]+arr[j]);
                int start = j+1;
                int end=arr.length-1;
                while (start<end){
                    int pair = arr[start]+arr[end];
                    if (pair< sum){
                        start++;
                    }
                    else if (pair > sum){
                        end--;
                    }
                    else {
                        System.out.println("(" + arr[i] + " " + arr[j] + " " +
                                arr[start] + " " + arr[end]  + ")");
                        start++;
                        end--;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={4, 1, 2, -1, 1, -3};
       int  target =1;
        //QuadrupleSumToTargetByBruteForce(arr,target);
        QuadrupleSumToTargetByTwoPointer(arr,target);
        System.out.println();
        QuadrupleSumToTargetByTwoPointer(new int[] {2, 0, -1, 1, -2, 2},2);
    }
}
