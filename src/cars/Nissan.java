package cars;

public class Nissan extends Car {
    //attribtues


    public Nissan(String make, String model, String year, String color, double price, int mileage){
        super(make, model, year, color, price, mileage);
    }
    //methods

    @Override
    public void printCarDetails(){
        //System.out.println("\nThis printCarDetails() method is from Nissan class \n");
        super.printCarDetails();
    }
}
