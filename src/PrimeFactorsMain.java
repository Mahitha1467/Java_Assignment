/**
 * Created by marveti on 5/17/16.
 */

import java.util.ArrayList;

class PrimeFactors{
    int num;
    void setNum(int n){
        num=n;
    }
    void primeFactor(){
        ArrayList <Integer> factors=new ArrayList<Integer>();
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                if (prime(i))
                    factors.add(i);
            }
        }
        System.out.println(factors);
    }
    boolean prime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                count++;
        }
        if(count==0)
            return true;
        return false;
    }
}

public class PrimeFactorsMain {
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        PrimeFactors obj=new PrimeFactors();
        obj.setNum(n);
        obj.primeFactor();
    }

}
