package OOPS.Inheritance;

public class Car {
    int Speed;
    int Cost;
    public Car(int s, int c) {
        this.Speed = s;
        this.Cost = c;
    }

    public void Brake(){
        System.out.println("Car Brakes gradually!");
    }
    public void Acc(){
        System.out.println("Car goes Vroom !");
    }

    @Override
    public String toString() {
        return ("Speed=" + Speed +", Cost=$" + Cost);
    }

    public void Engine(){
        System.out.println("Engine ON !");
    }
}
