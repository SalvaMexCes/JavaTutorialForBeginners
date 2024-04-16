package javaForBeginners;

public class Dog extends Animal implements Contract{

    public void fetch(){
        System.out.println("Dog plays fetch.");
    }

    @Override
    public void move(String movement, double milesPerHour){
        System.out.println("The dog is " + movement + " at " + milesPerHour + " mph.");
    }
}
