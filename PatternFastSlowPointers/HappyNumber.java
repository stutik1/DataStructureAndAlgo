package PatternFastSlowPointers;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number" );
        int number = sc.nextInt();
        System.out.print(number+" " );
        int rem =0;
        int sum =0;
        while (number>9){
            while (number > 0){
                rem = number % 10;
                sum = sum + (rem*rem);
                number=number/10;
            }
            number=sum;
            sum =0;
        }
        if(number==1){
            System.out.println("is a Happy Number");
        }
        else {
            System.out.println("is Unhappy Number");
        }
    }
}
