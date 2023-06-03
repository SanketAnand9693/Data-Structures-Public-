//Single level inheritence is also known as property inherited by only one class in a single class
//Multilevel inheritence is property inherited by the class which also inherit the property form another class.
//hierachical inheritence- property inherited by many class from a parent class.
//multiple inheritence is not allowed because child class cannot inherit properties from multiple parent class.
class animal{
        void display(){
            System.out.println("inherited property from animal class");
        }
    }
    class tiger extends animal
    {

    }
class _inheritence{
    public static void main(String[]args){
        tiger t1=new tiger();
        t1.display();
    }
}