
package com.dodatkowe;

public class AdditionalTask {

    public static void main (String[] args){

        GroundVehicles skateboard = new GroundVehicles("skateboard");
        skateboard.drive();

        WaterVehicles kanoe = new WaterVehicles("kanoe");
        kanoe.swim();

        AerialVehicles kite = new AerialVehicles("kite");
        kite.fly();
    }

}

class Vehicle {

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

