public class _dateTime
{
    public static void main(String args[])
    {
        java.util.Date dt=new java.util.Date();
        System.out.println(dt);
        //For printing date only
        long timeInMs=dt.getTime();
        java.sql.Date dt1=new java.sql.Date(timeInMs);
        System.out.println(dt1);

    }
}