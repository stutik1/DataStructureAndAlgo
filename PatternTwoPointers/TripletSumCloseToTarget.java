package PatternTwoPointers;

import java.util.Arrays;

public class TripletSumCloseToTarget {
    public static int tripletSumCloseToTargetByBruteForce(int []arr,int target){
        int closestSum = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    int tripleSum= arr[i]+arr[j]+arr[k];
                    if (Math.abs(target-closestSum)>Math.abs(target-tripleSum)){
                        closestSum = tripleSum;
                    }
                }
            }
        }
        return closestSum;
    }

        public static int tripletSumCloseToTargetByTwoPointer(int []arr,int target){
        Arrays.sort(arr);

        int closestSum = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            int start = i+1;
            int end = arr.length-1;

            while (start < end){
                  int tripleSum= arr[i]+arr[start]+arr[end];
                  if (Math.abs(target-closestSum)>Math.abs(target-tripleSum)){
                      closestSum = tripleSum;
                  }
                  if (tripleSum==target){
                      return tripleSum;
                  }
                  else if (tripleSum<target){
                      start++; //need triple with bigger sum
                  }
                  else {
                      end--;  //need triple with smaller sum
                  }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 2};
        System.out.println((tripletSumCloseToTargetByBruteForce(arr,2)));
        System.out.println(tripletSumCloseToTargetByBruteForce(new int[]{1, 0, 1, 1},100));

        System.out.println(tripletSumCloseToTargetByTwoPointer(new int[]{1, 0, 1, 1},100));
        System.out.println(tripletSumCloseToTargetByTwoPointer(new int[]{ 0,-2, 1, 2},2));
    }
}
