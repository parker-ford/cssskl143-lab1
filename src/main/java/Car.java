public class Car {
    String make;
    String model;
    double odometer;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        //
    }
    public Car(String make){
        this.make = make;
    }

    public String toString(){
        return this.make + " " + this.model + " " + this.odometer;
    }
}
