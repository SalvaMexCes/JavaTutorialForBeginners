package javaForBeginners;

public class House {

    public static int houseNumber;
    public static String streetName;
    public final static int NUM_OF_WINDOWS = 10;

    public void printInfo(){
        System.out.println("The house number is " + houseNumber + " on " + streetName + " street.");
    }

    //toString Method
    public String toString(){
        return String.format("%3d; %s", houseNumber, streetName);
    }

}
