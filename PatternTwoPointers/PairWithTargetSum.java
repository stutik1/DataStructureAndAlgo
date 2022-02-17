package PatternTwoPointers;

public class PairWithTargetSum {
    public static void targetSum(int arr[],int target) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum == target ){
                    System.out.println("pair found " + arr[i] + "," + arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2};
        int target = 5;
        targetSum(arr,target);
    }
}
