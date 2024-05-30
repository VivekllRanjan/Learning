package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        GasolineCar Gcar = new GasolineCar(180,250000,55);
        ElectricCar Ecar = new ElectricCar(200,300000, 500);
        Gcar.Engine();
        Gcar.Acc();
        Gcar.Brake();
        System.out.println(Gcar.toString());
        Ecar.Engine();
        Ecar.Acc();
        Ecar.Brake();
        System.out.println(Ecar.toString());
    }


}
