package main;
import cars.*;
import java.util.Scanner;

public class RunSimulation {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        int option;
        String car= "";

        System.out.println("<<Select an option>>\n1. Nissan \n2. Toyota");
        option= input.nextInt();

        Car selectedCar= null;
        switch(option){
            case 1:
            car= "Nissan";
            selectedCar= new Nissan("Nissan", "350z", "2007", "White", 5000.00, 120000);
            break;
            case 2:
            car= "Toyota";
            selectedCar= new Toyota("Toyota", "Corolla", "2005", "Gray", 3400, 240000);
            break;
        }
        System.out.println("You selected option:\n" + option + ". " + car); 
        System.out.println("\nPrinting car details...\n");
        selectedCar.printCarDetails();       


        input.close();
    }
}
