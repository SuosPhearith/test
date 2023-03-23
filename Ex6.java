package src.TP4;

import java.util.Scanner;

public class Ex6 {
    public double disAToB, disBToC, weight, petro;
    public Ex6(double disAToB, double disBToC, double weight) {
        this.weight = weight;
        this.disAToB = disAToB;
        this.disBToC = disBToC;
    }
    public double minLiters(double litersUsage) {
        double litersAToB, litersBToC, liters, petro;
        litersAToB = disAToB*litersUsage;
        litersBToC = disBToC*litersUsage;
        petro = 5000 - litersAToB;
        liters = litersBToC - petro;
        this.petro = petro;
        return liters;
    }
    public static void main(String[] args) {
        double disAToB, disBToC, weight, liters=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                                        Ex6
                --------------------------------------------------
                """);
        System.out.println("Calculate the minimum number of liters needed to refill at point B in order to reach point C.");
        System.out.print("Please input distance between A to B(Km): ");
        disAToB = sc.nextDouble();
        System.out.print("Please input distance between B to C(Km): ");
        disBToC = sc.nextDouble();
        System.out.print("Please input weight of goods(Kg): ");
        weight = sc.nextDouble();
        System.out.println();

        Ex6 ex6 = new Ex6(disAToB, disBToC, weight);
        
        if (weight<=30000) {
            if(weight<=5000) {
                liters = ex6.minLiters(10);
            }
            else if(weight<=10000) {
                liters = ex6.minLiters(20);
            }
            else if(weight<=20000) {
                liters = ex6.minLiters(25);
            }
            else if(weight<=30000) {
                liters = ex6.minLiters(35);
            }
            if(ex6.petro<0) {
                System.out.println("The distance between A and A is too far, 5000L of petro cannot reach at point B.");
            }
            else if((liters+ex6.petro)>5000) {
                System.out.println("The distance between B and C is too far, 5000L of petro cannot reach at point C.");
            }
            else {
                System.out.println("The minimum number of liters needed to refill at point B: " + liters + "L.");
            }
        }
        else {
            System.out.println("The weight is too high, ship cannot be loaded!!");
        }
        
        System.out.println("--------------------------------------------------");
    }
    
}
