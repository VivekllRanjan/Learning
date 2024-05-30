package OOPS.Inheritance;

public class GasolineCar extends Car{
    int fuelCapacity;

    @Override
    public String toString() {
        return (super.toString() + ", Fuel Capacity =" + this.fuelCapacity +"L"+"\nGasolineCar");
    }

    public GasolineCar(int s, int c, int f) {
        super(s, c);
        this.fuelCapacity = f;
    }
}
