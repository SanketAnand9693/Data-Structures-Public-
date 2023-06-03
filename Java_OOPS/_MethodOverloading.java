class Calc
{
    /*Method overloading means methods with same name but different 
      parameters or different type of parameters.
    */
    public int add(int a,int b){
        int result=a+b;
        return result;
    }
    public int add(int a,int b,int c){
        int result=a+b+c;
        return result;
    }
    public int add(int a,int b,int c,int d){
        int result=a+b+c+d;
        return result;
    }
    
}

public class _MethodOverloading {
    public static void main(String args[]){
        Calc data=new Calc();
        int _2para=data.add(2,3);
        int _3para=data.add(2,3,4);
        int _4para=data.add(4,56,6,7);
        System.out.print("Two parameters: ");
        System.out.println(_2para);
        System.out.print("Three parameters: ");
        System.out.println(_3para);
        System.out.print("Four parameters: ");
        System.out.println(_4para);
    }
}
