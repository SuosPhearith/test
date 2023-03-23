package src.TP4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                                        Ex7
                --------------------------------------------------
                """);
        System.out.println("Program for telling the Leap year.");
        System.out.print("Please input year(More than 1): ");
        int year = sc.nextInt();
        if(year<1) {
            System.out.println("Error: Please input more than than 1.");
        }
        else if(year%100==0) {
            System.out.println("\n" + year + " is not a leap year.");
        }
        else if(year%4==0) {
            System.err.println("\n" + year + " is a leap year.");
        }
        else {
            System.out.println("\n" + year + " is not a leap year.");
        }

        System.out.println("--------------------------------------------------");
    }
}
