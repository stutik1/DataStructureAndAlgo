package PatternTwoPointers;

import java.util.Arrays;

public class SquaringArray {
    public static void SquaringArray(int arr[]) {

        for(int i=0;i< arr.length;i++) {
            arr[i] = arr[i] * arr[i];
            System.out.println(arr[i]);
        }
    }

    public static void SquaringArrayBySorting(int arr[]) {
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++) {
            arr[i] = arr[i] * arr[i];
            System.out.println(arr[i]);
        }
    }

    public static int[] SquaringArrayByTwoPointer(int arr[]){
        int square[] = new int[arr.length];
        int i = arr.length-1;
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            if (arr[start] * arr[start] > arr[end] * arr[end]){
                square[i] = arr[start]* arr[start];
                start++;
            }
            else{
                square[i] = arr[end] * arr[end];
                end--;
            }
             System.out.println(square[i]);
        }
        return square;
    }
    public static int[] SquaringArrayByTwoPointer2(int arr[]){

        int square[] = new int[arr.length];
        int start =0;
        int end = arr.length-1;
        for(int i=0;i< arr.length;i++){
            if (arr[start] * arr[start] > arr[end] * arr[end]){
                square[i] = arr[start]* arr[start];
                start++;
            }
            else{
                square[i] = arr[end] * arr[end];
                end--;
            }
            System.out.println(square[i]);
        }
        return square;
    }
    public static void main(String[] args) {
        int arr[] = {7,-2,1,3,6};
       //SquaringArray(arr);
       SquaringArrayBySorting(arr);
       // SquaringArrayByTwoPointer(arr);
       // SquaringArrayByTwoPointer2(arr);

    }
}
