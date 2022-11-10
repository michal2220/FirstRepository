package com.dodatkowe;

public class AdditionalTask {

    public static void main (String[] args){

        GroundVehicles skateboard = new GroundVehicles( "skateboard",false, false);
        skateboard.identifyGroundVehlicle();
        skateboard.drive();
        skateboard.startEngine();

        System.out.println("\n");

        GroundVehicles car = new GroundVehicles ("car", true, true);
        car.identifyGroundVehlicle();
        car.drive();
        car.startEngine();
        car.drive();
        car.stopEngine();
        car.drive();

        System.out.println("\n");

        WaterVehicles kanoe = new WaterVehicles("kanoe", false);
        kanoe.swim();

        System.out.println("\n");

        AerialVehicles kite = new AerialVehicles("kite", false);
        kite.fly();
    }

}

class Engine {

    boolean hasEngine;
    boolean engineRunning;

    public Engine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public void startEngine() {
        if (hasEngine == false) {
            System.out.println("NO ENGINE!!!!!");
        }
        if (engineRunning==true){
            System.out.println("Engine was already turned on!!!!!");
        }
        else {
            System.out.println("Engine is on");
            engineRunning = true;
        }
    }

    public void stopEngine() {
        if (engineRunning == false) {
            System.out.println("ENGINE WAS OFF");
        } else {
            System.out.println("Engine is off");
            engineRunning = false;
        }
    }
}

class Vehicle extends Engine{

    public String type;

    public Vehicle(boolean hasEngine){
        super(hasEngine);
    }

    public void identify(){
        System.out.println("I'm a "+type+" vehicle");
    }
}


class GroundVehicles extends Vehicle{


    private String name;
    private boolean needsEngineRunning;

    public GroundVehicles(String name, boolean hasEngine, boolean needsEngineRunning){
        super(hasEngine);
        this.name=name;
        this.needsEngineRunning = needsEngineRunning;

    }
    public void identifyGroundVehlicle(){
        type="ground";
        super.identify();
        System.out.println("I drive on land because I'm a "+name);
    }
    public void drive(){
        if (needsEngineRunning == true&& engineRunning==false){
            System.out.println("Turn on the engine!!!");
        }
        if (needsEngineRunning == true&& engineRunning==true){
            System.out.println("Driving!");
        }
        if (needsEngineRunning == false){
            System.out.println("Driving!");
        }
    }
}

class WaterVehicles extends Vehicle{

    private String name;

    public WaterVehicles(String name, boolean hasEngine){
        super(hasEngine);
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

    public AerialVehicles(String name, boolean hasEngine){
        super(hasEngine);
        this.name=name;
    }
    public void fly(){
        type="air";
        super.identify();
        System.out.println("I fly in the because I'm a "+name);
    }
}