package src.TP4;

import java.util.Scanner;

public class Ex3 {
    public int reverseNumber(int num, int digits) {
        int reverseNum = 0;
        int n = digits;
        int a;
        for(int i=0; i<digits; i++) {
            a = (int)Math.pow(10.00,(n-1));
            reverseNum = reverseNum + (num%10)*a;
            num/=10;
            n--;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
        int number,reverseNumber;
        Ex3 ex3 = new Ex3();
        LuckyNumber luckyNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                                        Ex3
                --------------------------------------------------
                """);
        System.out.println("Program for reversing a 4 digits number");
        System.out.print("Please input 4 digits number: ");
        number = sc.nextInt();
        luckyNumber = new LuckyNumber(number);

        if(!luckyNumber.isValid(4)) {
            System.out.println("\nError: Invalid input number, please input only 4 digits number.");
        }
        else {
            reverseNumber = ex3.reverseNumber(number, 4);
            System.out.println("\nAfter resverse: " + reverseNumber);
        }
        System.out.println("--------------------------------------------------");

    }
    
}
