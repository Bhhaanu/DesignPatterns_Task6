package factory;

public class Car extends Vehicle {
    int wheel;
    Car(int wheel){
        this.wheel=wheel;
    }
    public int getWheel(){
        return this.wheel;
    }
}
