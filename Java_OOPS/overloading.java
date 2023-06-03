class Calc
{
    public void show(Byte n)
    {
        System.out.println("Byte "+ n);
    }
    public void show(Short n)
    {
        System.out.println("short "+n);
    }
    public void show(char n)
    {
        System.out.println("char "+n);
    }
    public void show(int n)
    {
        System.out.println("int "+n);
    }
    public void show(Double n)
    {
        System.out.println("double "+n);
    }    
}

public class overloading {
    public static void main(String[]args){
        Calc data=new Calc();
        data.show(3);
    }
}
