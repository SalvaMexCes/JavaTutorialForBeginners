package javaForBeginners;

public interface Contract {

    public default void printInfo(){
        System.out.println("This is being invoked from Interface 'Contract'");
    }
}
