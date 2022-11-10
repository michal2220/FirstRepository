package com.dodatkoweWesja2;

public class Dodatkowe2 {

    public static void main (String[] args){

        GroundVehicles skateboard = new GroundVehicles( "skateboard");
        skateboard.drive();

        System.out.println("\n");

        WaterVehicles kanoe = new WaterVehicles("kanoe");
        kanoe.swim();

        System.out.println("\n");

        AerialVehicles kite = new AerialVehicles("kite");
        kite.fly();

        System.out.println("\n");

        GroundVehiclesWithEngine car = new GroundVehiclesWithEngine ("car", "hybride");
        car.gVDrive();
        car.startEngine();
        car.gVDrive();
        car.startEngine();
    }

}

class Vehicle{

    public String type;

    public void identify(){
        System.out.println("I'm a "+type+" vehicle");
    }
}

class GroundVehicles extends Vehicle{
    private String name;

    public GroundVehicles(String name){
        this.name=name;
    }
    public void drive(){
        type="ground";
        super.identify();
        System.out.println("I drive on land because I'm a "+name);
    }
}

class WaterVehicles extends Vehicle{

    private String name;

    public WaterVehicles(String name){
        this.name=name;
    }
    public void swim(){
        type="water";
        super.identify();
        System.out.println("I swim on water because I'm a "+name);
    }
}

class AerialVehicles extends Vehicle{

    private String name;

    public AerialVehicles(String name){
        this.name=name;
    }
    public void fly(){
        type="air";
        super.identify();
        System.out.println("I fly in the because I'm a "+name);
    }
}

class Engine extends Vehicle{

    boolean engineRunning;
    private String name;
    public Engine(String name){
        this.name=name;
    }

    public void startEngine(){
        if(engineRunning==true){
            System.out.println("Enegine was already on!!!");
        }else {
            System.out.println("Starting Engine!!! \nEngine is running");
            engineRunning = true;
        }

    }

    public  void chokeEngine(){
        if (engineRunning==false){
            System.out.println("Engine is already off!!!");
        }else {
            System.out.println("shutting down engine");
            engineRunning = false;
        }
    }

    public void go (){
        if (engineRunning==false){
            System.out.println("Im a "+name+" and I need to start Engine!!!!");
        }

        if (engineRunning==true){
            System.out.println("I drive on land because I'm a "+name);
            System.out.println("Driving!!!");


        }

    }



}

class GroundVehiclesWithEngine extends Engine{

    private String engineType;

    public GroundVehiclesWithEngine(String name, String engineType){
        super(name);
        this.engineType=engineType;
    }

    public void gVDrive(){
        type="ground";
        super.identify();
        System.out.println("My engnie is "+engineType);
        super.go();
        System.out.println("\n");


    }


}