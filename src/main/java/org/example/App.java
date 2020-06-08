package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Car saab = new Car();

        saab.brand = "SAAB";
        saab.modelName = "900 Turbo";
        saab.topSpeed = 245;

        Car volvo = new Car();
        volvo.brand = "Volvo";
        volvo.modelName = "S60 T5";
        volvo.topSpeed = 220;

        System.out.println(volvo.getInfo());
        System.out.println(saab.getInfo());
    }
}

class Car {
    String modelName;   //class field
    String brand;       //class field
    int topSpeed;       //class field

    public String getInfo() {
        return "Car: " + brand + " | " + modelName + " | " + topSpeed;
    }
}






 /*
        int userAge = 20;
        int ageLimit = 18;

        System.out.println("User age: " + userAge);
        System.out.println("Age limit: " + ageLimit);

        System.out.println("Is allowed to drink:" + (userAge >= ageLimit));

        switch (userAge) {
            case 21:
                System.out.println("You may drive a car");
                break;
            case 20:
            case 19:
            case 18:
                System.out.println("You get a beer");
                break;
            default:
                System.out.println("You get a soda");
                break;
        }

        */