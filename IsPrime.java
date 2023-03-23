package src.TP4;

public class IsPrime {
    public int number;
    public int disvisible;
    public IsPrime(int num) {
        number = num;
    }
    public boolean isPrime(){
        if(number <= 1)
        {
            return false;
        }
             
        else {
            for(int i=2; i<number; i++) {
                if(number%i == 0) {
                    disvisible = i;
                    return false;
                }
                    
            }
        }
        return true;
    }
}
