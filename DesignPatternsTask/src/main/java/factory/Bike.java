package factory;

public class Bike extends Vehicle {
    int wheel;
    Bike(int wheel){
        this.wheel=wheel;
    }
    public int getWheel(){
        return this.wheel;
    }
}
