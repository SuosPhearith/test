package src.TP4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                                        Ex2
                --------------------------------------------------
                """);
        System.out.println("Program for testing number.");
        System.out.print("Please input 6 digits number: ");
        LuckyNumber luckyNumber =  new LuckyNumber(sc.nextInt());

        if(!luckyNumber.isValid(6)) {
            System.out.println("\nErr0r: Invalid input number, please input only 6 digits number.");
        }
        else if(luckyNumber.isLucky()) {
            System.out.println("\n" + luckyNumber.amount + " is lucky number.");
        }
        else {
            System.out.println("\n" + luckyNumber.amount + " is not lucky number.");
        }
        System.out.println("--------------------------------------------------");

    }
    
}
