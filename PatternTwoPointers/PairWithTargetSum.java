package PatternTwoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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
    
    public static boolean targetSumByHashSet(int arr[] ,int target){
        if(arr.length==0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if(set.contains(target-arr[i])){
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }
        return false;
    }


    public static int[] findTargetSumIndexByHashmap(int []arr,int target){
        // value = index
        //key = value of index
        if(arr == null || arr.length==0){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            map.put(arr[i],i);
        }
        for (int i=0;i< arr.length;i++){
            int Diff = target-arr[i];
            if (map.containsKey(Diff)){
                return new int[]{i, map.get(Diff)};
            }
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        int arr[] = {1,2, 3,4,5};
        int target = 5;
        int result[] = findTargetSumIndexByHashmap(arr,target);
       //targetSum(arr,target);
       // targetSumByTwoPointers(arr,target);
        //System.out.println(targetSumByHashSet(arr,target));
        System.out.print(result[0]+ ",");
        System.out.print(result[1]);
    }
}
