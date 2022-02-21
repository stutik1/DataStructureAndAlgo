package Searching;
// Find mid index : mid = (low+ high)/2
//if a[mid] == key  ,Return mid
//if key > a[mid] ,Repeat low = mid+1
//if key < a[mid] ,Repeat high = mid -1
// Time Complexity = O(logn)

public class BinarySearch {
    public static int binarySearch(int arr[], int search) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == search){
                return mid;
            }
            else if (arr[mid] < search){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 6, 8, 10, 40, 60, 70};
        int search = 40;
        int result = binarySearch(arr, search);
        if (result == -1)
            System.out.println("Element not present");
        else{
            System.out.println("Element index " + result);
        }
    }
}
