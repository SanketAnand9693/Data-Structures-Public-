class library implements Runnable
{
    String rs1=new String("JAVA");
    String rs2=new String("SQL");
    String rs3=new String("DSA");
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT1")){
            
        }
    }
}
public class deadlock{
    public static void main(String[]args){
        library lib=new library();
        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);
        t1.setName("STUDENT1");
        t2.setName("STUDENT2");
        t1.start();
        t2.start();

    }
}