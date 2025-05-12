package cars;
public abstract class Car {
    //attributes

    private String make;
    private String model;
    private String year;
    private String color;
    private double price;
    private int mileage;

    public Car(String make, String model, String year, String color, double price, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }
    //methods

    /**
     * This method returns the make of the car
     * @return
     */
    public String getMake(){
        return make;
    }

    /**
     * This method gets the model of the car
     * @return
     */
    public String getModel(){
        return model;
    }

    /**
     * This method gets the year of the car
     * @return
     */
    public String getYear(){
        return year;
    }

    /**
     * This method gets the color of the car
     * @return 
     */
    public String getColor(){
        return color;
    }

    /**
     * This method gets the price of the car
     * @return color
     */
    public double getPrice(){
        return price;
    }

    /**
     * This method gets the mileage of the car
     * @return mileage
     */
    public int getMileage(){
        return mileage;
    }
}
