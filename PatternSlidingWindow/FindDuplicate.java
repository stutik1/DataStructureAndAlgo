package PatternSlidingWindow;

public class FindDuplicate {
    public static void Duplicate(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,2,1};
        Duplicate(arr);
    }
}
