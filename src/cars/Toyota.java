package cars;

public class Toyota extends Car {
    //attribtues


    public Toyota(String make, String model, String year, String color, double price, int mileage){
        super(make, model, year, color, price, mileage);
    }
    //methods

    @Override
    public void printCarDetails(){
        //System.out.println("\n\nThis printCarDetails() method is from Toyota class \n");
        super.printCarDetails();
        
    }
}
