public class Vehicle {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public String getModel() {
        return model;
    }

    public static void setMake(String make) {
        MAKE = make;
    }
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
    public static class Engine extends Vehicle {
        private static final String ENGINE_MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Construtor que chama super com o modelo
        public Engine(String model) {
            super(model);
        }

        public static String getEngineMake() {
            return ENGINE_MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }
}