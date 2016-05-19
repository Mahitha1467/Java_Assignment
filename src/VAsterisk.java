/**
 * Created by marveti on 5/17/16.
 */
class PrintAsteriskVertically{
    int num;
    void setNum(int n){
        num=n;
    }
    /*int getNum(){
        return num;
    }*/
    void printAsterisk(){
        for(int i=0;i<num;i++)
            System.out.println("*");
    }
}

public class VAsterisk {
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        PrintAsteriskVertically obj=new PrintAsteriskVertically();
        obj.setNum(num);
        obj.printAsterisk();
    }
}
