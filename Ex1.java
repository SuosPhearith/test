package src.TP4;
import java.util.Scanner;
 
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                                        Ex1
                --------------------------------------------------
                """);
        System.out.print("Input number to check whether it is prime number: ");
        IsPrime p = new IsPrime(sc.nextInt());
        if(p.isPrime()) {
            System.out.println(p.number + " is a prime number.");
        }
        else {
            System.out.println(p.number + " is not prime number, because it is divisible to " + p.disvisible + "." );
        }
        System.out.println("--------------------------------------------------");
    }
}

