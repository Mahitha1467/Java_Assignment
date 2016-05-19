/**
 * Created by marveti on 5/17/16.
 */
class PrintAsteriskHorizantolly{
    int num;
    void setNum(int n){
        num=n;
    }
    /*int getNum(){
        return num;
    }*/
    void printAsterisk(){
        for(int i=0;i<num;i++)
            System.out.print("*");
    }
}

public class HAsterisk {
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        PrintAsteriskHorizantolly obj=new PrintAsteriskHorizantolly();
        obj.setNum(num);
        obj.printAsterisk();
    }
}
