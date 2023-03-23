package src.TP4;

import java.util.Scanner;

public class TasksRunnerTP04 {
    public void Menu() {
        System.out.println("""
            -------- Menu ---------
            1. Prime number
            2. Lucky number
            3. Reversing number
            4. Money exchange
            5. Max among 8 numbers
            6. Shipping
            7. Leap year
            0. Exit""");
    }
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        TasksRunnerTP04 tr = new TasksRunnerTP04();

        do {
            tr.Menu();
            System.out.print("Choose an option: ");
            option = sc.nextInt();
            switch(option) {
                case 1:
                    Ex1.main(args);
                    break;
                case 2:
                    Ex2.main(args);
                    break;
                case 3:
                    Ex3.main(args);
                    break;
                case 4:
                    Ex4.main(args);
                    break;
                case 5:
                    Ex5.main(args);
                    break;
                case 6:
                    Ex6.main(args);
                    break;
                case 7:
                    Ex7.main(args);
                    break;
                case 0:
                    System.out.println("Thanks for using our programs !\n");
                    break;
                default :
                    System.out.println("Option is not available !!");
                    break;
            }        
        }
        while(option != 0);
    }
}
