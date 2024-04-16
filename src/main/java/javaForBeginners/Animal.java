package javaForBeginners;

public class Animal implements Contract{

    String name;
    double weight;
    private String food;
    private String privateName;
    private int privateInt;



    void talk(){
        System.out.println("ROAR!");
    }

    void hungry(){
        System.out.println("My " + name + " needs to be fed!");
    }

    //Getter
    double getWeight(){
        return weight;
    }

    //Setters
    public void setName(String newName){
        name = newName;
    }

    public void setFood(String food){
        this.food = food;
    }

    //Method
    public void move(String movement, double milesPerHour){
        System.out.println("Lion is now " + movement + " at " + milesPerHour + " mph.");
    }

    //Constructors
    public Animal(){
        System.out.println("empty constructor running!");
    }

    public Animal(String privateName){
        System.out.println("String constructor running!");
    }

    public Animal(String privateName, int privateInt){
        System.out.println("Multi-parameter constructor running!");
        this.privateName = privateName;
        this.privateInt = privateInt;
    }

    @Override
    public void printInfo() {
        Contract.super.printInfo();
    }
}
