/**
 * Created by marveti on 5/17/16.
 */
class PrintCenterAsteriskTriangle{
    int num;
    void setNum(int n){
        num=n;
    }
    /*int getNum(){
        return num;
    }*/
    void printTriangle(){
        for(int i=0;i<num;i++){
            for(int j=0;j<(num-i-1);j++)
                System.out.print(" ");
            for(int k=0;k<(2*i+1);k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

public class CenterAsteriskTriangle {
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        PrintCenterAsteriskTriangle obj=new PrintCenterAsteriskTriangle();
        obj.setNum(num);
        obj.printTriangle();
    }
}

