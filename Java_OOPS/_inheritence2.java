class aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is takeoff");
    }
    public void fly(){
        System.out.println("Aeroplane is fly");
    }
}
class cargoPlane extends aeroplane
{
    public void takeoff(){
        System.out.println("Cargo plan is takeoff");
    }
    public void fly(){
        System.out.println("Cargo plane is flying");
    }
}
class passengerPlane extends aeroplane
{
    public void takeoff(){
        System.out.println("Passenger plane is takeoff");
    }
    public void fly(){
        System.out.println("Passsenger plane is flying");
    }

}
class _inheritence2{
    public static void main(String[]args){
        cargoPlane cp=new cargoPlane();
        cp.takeoff();
        cp.fly();
        passengerPlane pp=new passengerPlane();
        pp.takeoff();
        pp.fly();
    }
}