/**
 * Created by marveti on 5/17/16.
 */
class PrintAsteriskDiamondWithName{
    int num;
    String name;
    void setNum(int n){
        num=n;
    }
    /*int getNum(){
        return num;
    }*/
    void setName(String n){
        name=n;
    }
    /*String getNum(){
        return name;
    }*/
    void printTriangle(){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<(num-i-1);j++)
                System.out.print(" ");
            for(int k=0;k<(2*i+1);k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println(name);
        for(int i=num-2;i>=0;i--){
            for(int j=0;j<(num-i-1);j++)
                System.out.print(" ");
            for(int k=0;k<(2*i+1);k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

public class AsteriskDiamondWithName {
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        String name=args[1];
        PrintAsteriskDiamondWithName obj=new PrintAsteriskDiamondWithName();
        obj.setNum(num);
        obj.setName(name);
        obj.printTriangle();
    }
}

