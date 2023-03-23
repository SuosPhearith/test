package src.TP4;

import java.util.Scanner;

public class Ex5 {
    public int maxNum(int number, int digits) {
        int max=0, n;
        for(int i=0; i<digits; i++) {
            n = number%10;
            number /= 10;
            if(n>max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        Ex5 ex5 = new Ex5();
        LuckyNumber luckyNumber;
        System.out.println("""
                --------------------------------------------------
                                        Ex5
                --------------------------------------------------
                """);
        System.out.println("Program for find the maximum of 8 digits number.");
        System.out.print("Please input 8 digits number: ");
        number = sc.nextInt();
        luckyNumber = new LuckyNumber(number);
        if(!luckyNumber.isValid(8)) {
            System.out.println("\nError: Invalid input number, please input only 8 digits number.");
        }
        else {
            System.out.println("\nThe maximum number: " + ex5.maxNum(number, 8));
        }
        System.out.println("--------------------------------------------------");
    }
    
}
