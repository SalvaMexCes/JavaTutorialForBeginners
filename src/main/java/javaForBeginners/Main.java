package javaForBeginners;

import examplePackage.*;
import examplePackage.subPackage.subClassOfSubPackage;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Part 1
        System.out.println("\n" + "Hello beautiful world!");
        System.out.println("===============================================");

        //Part 2
        int intVariable = 33;
        short shortVariable = 444;
        long longVariable = 5555;
        double doubleVariable = 1.234;
        float floatVariable = 369.1f;
        char charVariable = 'A';
        boolean booleanVariable = true;
        byte byteVariable = 123;

        System.out.println(intVariable);
        System.out.println(shortVariable);
        System.out.println(longVariable);
        System.out.println(doubleVariable);
        System.out.println(floatVariable);
        System.out.println(charVariable);
        System.out.println(booleanVariable);
        System.out.println(byteVariable);
        System.out.println("===============================================");

        //Part 3
        int int1 = 10;
        double double1 = 4.5;
        String text = "Hola!";
        String blank = " ";
        String name = "Cesar";
        String greeting = text + blank + name;

        System.out.println(greeting);
        System.out.println("How are you" + " " + "Walter");
        System.out.println("The integer's value is " + int1);
        System.out.println("My double's value is " + double1 + ".");
        System.out.println("===============================================");

        //Part 4
        int intValue = 0;

        while(intValue < 4){
            System.out.println("Wassup! " + intValue);
            intValue = intValue + 1;
        }
        System.out.println("===============================================");

        //Part 5
        for (int x = 0; x < 6; x++){
            System.out.println("Value of X is: " + x);
        }
        System.out.println("===============================================");

        //Part 6
        int customInt = 15;

        if (customInt < 10){
            System.out.println("Too cold!");
        } else if(customInt > 20){
            System.out.println("Too hot!");
        } else{
            System.out.println("Just right.");
        }

        System.out.println("");

        int whileLoop = 0;
        while (true){
            System.out.println("Loop: " + whileLoop);
            if (whileLoop == 4){
                break;
            }
            whileLoop++;
            System.out.println("Loop still running");
            System.out.println("===============================================");
        }

        //Part 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userInput = scanner.nextLine();
        System.out.println("How old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Hello " + userInput + " you are " + userAge + " years old.");
        System.out.println("What is your weight in pounds? please use at least one decimal place.");
        double userWeight = scanner.nextDouble();
        System.out.println("You entered " + userWeight + " lbs. Thank you.");
        System.out.println("===============================================");

        //Part 8
        int randomGuess = 0;
        do {
            System.out.println("Guess a number from 0-5:");
            randomGuess = scanner.nextInt();
        } while (randomGuess != 4);
        System.out.println("You guessed correctly!");
        System.out.println("===============================================");

        //Part 9
        Scanner switchInput = new Scanner(System.in);
        System.out.println("Please enter a primary color:");
        String switchText = switchInput.nextLine();

        switch(switchText){
            case "red":
                System.out.println("Red is my favorite color!");
                break;
            case "blue":
                System.out.println("blue is my brother's favorite color!");
                break;
            case "green":
                System.out.println("green is a good choice!");
                break;
            case "yellow":
                System.out.println("yellow is too bright!");
                break;
            default:
                System.out.println("sorry, that is not a primary color.");
        }
        System.out.println("===============================================");

        //Part 10
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 3;
        intArray[1] = 6;
        intArray[2] = 9;
        for (int xx = 0; xx < intArray.length; xx++){
            System.out.println(intArray[xx]);
        }

        System.out.println("\n");

        int[] numArray  = {2, 4, 6};
        for (int cc = 0; cc < intArray.length; cc++){
            System.out.println(numArray[cc]);
        }
        System.out.println("===============================================");

        //Part 11
        String[] snacks = {"Chips", "Cookies", "Chocolate"};
        for (String snack: snacks){
            System.out.println(snack);
        }
        System.out.println("===============================================");

        //Part 12
        int[][] twoDarray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}
        };
        /* When invoking, row is referenced first, then column.
           The first row is index 0, the first column is index 0.
           Let's call/invoke #3                                  */

        System.out.println(twoDarray[0][2]);
        System.out.println();

        /*      Let's print our entire array ON THE SAME LINE, row by row.       */
        for (int row=0; row<twoDarray.length; row++){
            for (int column=0; column<twoDarray.length; column++){
                System.out.print(twoDarray[row][column] + "\t");    //removing the "Ln" from printLn is essential to print on the same line
            }
            System.out.println();
        }
        System.out.println("===============================================");

        //Part 13
        Animal animal1 = new Animal();
        animal1.name = "lion";
        animal1.weight = 250.00;

        System.out.println("I have a pet " + animal1.name);
        System.out.println("===============================================");

        //Part14
        animal1.hungry();
        animal1.talk();
        System.out.println("===============================================");

        //Part15
        double weight = animal1.getWeight();
        System.out.println("My pet lion weighs " + weight + " lbs.");
        System.out.println("===============================================");

        //Part16
        animal1.move("moving west", 30.5);
        System.out.println("===============================================");

        //Part 17
        Animal animal2 = new Animal();
        animal2.setName("Wolf");
        animal2.setFood("rabbits");
        System.out.println("===============================================");

        //Part18
        new Animal();
        Animal animal3 = new Animal("Giraffe");
        Animal animal4 = new Animal("Zebra", 2121);
        System.out.println("===============================================");

        //Part 19
        House house1 = new House();
        House.streetName = "Churchman's road";
        House.houseNumber = 109;
        house1.printInfo();
        System.out.println("This house has " + House.NUM_OF_WINDOWS + " windows.");
        System.out.println("===============================================");

        //Part 20*
        String customString = "";
        customString += "My name is";
        customString += " Cesar";
        System.out.println(customString);

        StringBuilder sb = new StringBuilder();
        sb.append("This string");
        sb.append(" is being appended");
        sb.append(" line by line.");
        System.out.println(sb.toString());
        /*      FORMATTING      */
        System.out.printf("total cost %-2d; quantity is %d\n", 10,120);
        System.out.printf("total cost is %.2f\n", 3.14567);
        System.out.println("===============================================");

        //Part 21*
        House myHouse = new House();
        System.out.println(myHouse);
        System.out.println("===============================================");

        //Part22
        Dog doggy = new Dog();
        doggy.move("chasing the squirrel", 23);
        System.out.println("===============================================");

        //Part23
        Dog skippy = new Dog();
        skippy.printInfo();

        Contract contract1 = new Animal();
        contract1.printInfo();
        System.out.println("===============================================");

        //Part24
        ExampleClass invokePackage = new ExampleClass();
        /*    Refer to line 3 & 4 for import commands      */

        //Part25
        System.out.println(Part25.weight);
        /*System.out.println(Part25.name);      'Protected' invoke wont work    */
        System.out.println("===============================================");

        //Part26*
        Animal scooby = new Animal();
        Dog alphaDog = new Dog();
        Animal courageTheCowardlyDog = alphaDog;
        Animal stitch;

        courageTheCowardlyDog.talk();
        System.out.println("===============================================");

       //Part27
        Encapsulation example = new Encapsulation();
        System.out.println(example.getAvgShotsOnTarget());





































    }
}
