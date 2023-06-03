class _multithreading{
    public class car{
        void run(){

        }
    }
    class myThread extends Thread
    {

    }
    public static void main(String[]args){
        car c1=new car();
        myThread t1=new myThread();
        c1.run();
        t1.start(); 
    }
}