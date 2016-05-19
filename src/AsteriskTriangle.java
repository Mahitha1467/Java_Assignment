/**
 * Created by marveti on 5/17/16.
 */
class PrintAsteriskTriangle{
    int num;
    void setNum(int n){
        num=n;
    }
    /*int getNum(){
        return num;
    }*/
    void printTriangle(){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

public class AsteriskTriangle {
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        PrintAsteriskTriangle obj=new PrintAsteriskTriangle();
        obj.setNum(num);
        obj.printTriangle();
    }
}
