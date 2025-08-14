// abstraction Code of a Car
public class Car {
    static int FuelLevel;
    static int engineLevel;

    public static void Start(){
        if(checkFuel() && engineFuelLevel()){
            System.out.println("Car started");
        } else {
            System.out.println("Some problem occurred");
        }
    }

    private static boolean checkFuel(){
        return FuelLevel > 5;
    }

    private static boolean engineFuelLevel(){
        return engineLevel > 2;
    }

    public static void main(String[] args){
        // Initialize the fuel levels
        FuelLevel = 10;
        engineLevel = 5;

        Start();
    }
}
