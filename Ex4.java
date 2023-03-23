package src.TP4;

import java.util.Scanner;

import javax.swing.ScrollPaneLayout;

public class Ex4 {
    public double amount;
    public Ex4(double amount) {
        this.amount = amount;
    }
    public Ex4() {
        
    }
    public double reilsToUsd(double amount) {
        double usd;
        usd = amount/4000.00;
        return usd;
    }
    public double reilsTobath(double amount) {
        double bath;
        bath = amount/133.33;
        return bath;
    }
    public double bahtsToReils(double amount) {
        double riels;
        riels= amount*133.33; 
        return riels;
    }
    public double bahtsToUsd(double amount) {
        double usd;
        usd= amount/30; 
        return usd;
    }
    public double usdToReils(double amount) {
        double riels;
        riels = 4000.00*amount;
        return riels;
    }
    public double usdToBaht(double amount) {
        double baht;
        baht = 30.00*amount;
        return baht;
    }
    public double exchangeMoney(int option, double amount){
        Ex4 ex4 = new Ex4();
        //ex4.menu();

        switch(option){
            case 1: {
                return ex4.reilsToUsd(amount);
            }
            case 2:{
                return ex4.reilsTobath(amount);
            }
            case 3:{
                return ex4.usdToReils(amount);
            }
            case 4:{
                return ex4.usdToBaht(amount);
            }
            case 5:{
                return ex4.bahtsToReils(amount);
            }
            case 6:{
                return ex4.bahtsToUsd(amount);
            }
            default:{
                return 0;
            }
        }
    }
    public void menu() {

        System.out.print("""
            Welcome to program Money Exchanges!
            1. Riels to Dollar
            2. Riels to Thai Baht
            3. Dollar to Riels
            4. Dollar to Thai Baht
            5. Thai Baht to Riels
            6. Thai baht to Dollar
                """);
    }
    public String doMenu(int option){
        switch(option){
            case 1: {
                return "1. Riels to Dollar";
            }
            case 2:{
                return "2. Riels to Thai Baht";
            }
            case 3:{
                return "3. Dollar to Riels";
            }
            case 4:{
                return "4. Dollar to Thai Baht";
            }
            case 5:{
                return "5. Thai Baht to Riels";
            }
            case 6:{
                return "6. Thai baht to Dollar";
            }
            default:{
                return "please Input again!!";
            }
        }
    }
    
    public static void main(String[] args) {
        int option;
        double amount;
        Ex4 ex4 = new Ex4();
        ex4.menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your option: ");
        option = sc.nextInt();
        System.out.println(ex4.doMenu(option));
        if(ex4.doMenu(option) !=  "please Input again!!"){
            System.out.print("Please input your amount: ");
            amount = sc.nextDouble();
            System.out.println("Result of converting is : " + ex4.exchangeMoney(option, amount));
        }else{
            System.out.println("My options have only 1 to 6 ");
        }
        


    }
}
