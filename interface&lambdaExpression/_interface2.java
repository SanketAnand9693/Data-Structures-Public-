interface computer //Interface is generally used for designing purpose  
{
    void compileCode();
}
class desktop implements computer
{
   public void compileCode(){
        System.out.println("You got 5 errors....Faster");
    }
}
class laptop implements computer
{
    public void compileCode(){
        System.out.println("You got 5 errors.... slower");
    }
}

public class _interface2 {
    public static void main(String[] args) {
        computer obj1=new desktop();
        obj1.compileCode();
        computer obj2=new laptop();
        obj2.compileCode();
    }
}
