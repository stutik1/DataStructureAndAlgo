package PatternTwoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateOfUnSortedArray {

    public static void unSortedArray(int[]arr){
        int j=0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[arr.length-1];
        for (int k=0 ;k<j;k++){
            System.out.println(arr[k]+ " ");
        }
    }

    public static void unSortedArrayBySorting(int[]arr) {
        Arrays.sort(arr);
        int j=0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[arr.length-1];
        for (int k=0 ;k<j;k++){
            System.out.println(arr[k]+ " ");
        }
    }

    public static void unSortedArrayByHashSet(int[] arr ) {
        HashSet <Integer> set = new HashSet<>();
        for (int i=0;i< arr.length;i++){
            set.add(arr[i]);
            System.out.print(set);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,5,4,7,7,3};
       // unSortedArray(arr);
       // unSortedArrayBySorting(arr);
        unSortedArrayByHashSet(arr);


    }
}
