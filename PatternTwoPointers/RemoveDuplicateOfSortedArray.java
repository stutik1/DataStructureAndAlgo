package PatternTwoPointers;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateOfSortedArray {
    public static void Duplicate(int arr[]) {
        int temp[] = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                temp[j] = arr[i];
                j++;
            }
        }
            temp[j] = arr[arr.length-1];
            for (int i=0;i<temp.length;i++){
                System.out.print(temp[i] + " ");
            }
    }

    public static void Duplicate1(int arr[]) {
      //  int temp[] = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];
        for (int i=0;i< j+1;i++){  // print all j elements
            System.out.print(arr[i] + " ");
        }
    }

public static void Duplicate2(int arr[]){
    Set<Integer> set = new HashSet<>();
    for (int i=0;i< arr.length;i++){
        set.add(arr[i]);
        System.out.println(set);
    }
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4};
        //Duplicate(arr);
       //  Duplicate1(arr);
         Duplicate2(arr);

    }
}
