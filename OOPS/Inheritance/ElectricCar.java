package OOPS.Inheritance;

public class ElectricCar extends Car{

    int batteryCapacity;

    @Override
    public String toString() {
        return (super.toString() +", Battery Capacity="+this.batteryCapacity+"KV"+"\nElectricCar");
    }

    public ElectricCar(int s, int c, int b) {
        super(s, c);
        this.batteryCapacity = b;
    }
}
