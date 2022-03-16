package PatternFastSlowPointers;

public class HappyNumbers {
    public static boolean happyNumber(int number){
        int sum =0;
        int rem =0;
        while (number>9){
            while (number>0){
                rem = number%10;
                sum = sum +(rem*rem);
                number = number/10;
            }
            number=sum;
            sum=0;
        }
        if (number==1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
       int number = 7;
       System.out.println(happyNumber(number)) ;

    }
}
