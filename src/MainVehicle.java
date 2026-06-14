public class MainVehicle {

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle1.getModel());
        System.out.println("The chassis number is " + vehicle1.getChassisNo());

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle2.getModel());
        System.out.println("The chassis number is " + vehicle2.getChassisNo());

        vehicle2.setMake("Seer");
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        System.out.println("\nVehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + 
                           Vehicle.Engine.getCapacity() + "cc");

        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}