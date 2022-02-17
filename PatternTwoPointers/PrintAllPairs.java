package PatternTwoPointers;

public class PrintAllPairs {
    public static void PrintPair(int arr[]) {
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        PrintPair(arr);

    }
}
