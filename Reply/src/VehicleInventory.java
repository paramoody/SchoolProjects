
	import java.util.HashMap;
	import java.util.Map;

	public class VehicleInventory {
	    private Map<String, Integer> inventory;

	    public VehicleInventory() {
	        inventory = new HashMap<>();
	    }

	    public void addVehicle(String vehicle) {
	        inventory.put(vehicle, inventory.getOrDefault(vehicle, 0) + 1);
	    }

	    public int getInventorySize() {
	        return inventory.size();
	    }

	    public int getFrequency(String vehicle) {
	        return inventory.getOrDefault(vehicle, 0);
	    }

	    public static void main(String[] args) {
	        VehicleInventory vehicleInventory = new VehicleInventory();

	        vehicleInventory.addVehicle("Car");
	        vehicleInventory.addVehicle("Truck");
	        vehicleInventory.addVehicle("Car");
	        vehicleInventory.addVehicle("Motorcycle");
	        vehicleInventory.addVehicle("Car");
	        vehicleInventory.addVehicle("Truck");

	        System.out.println("Inventory Size: " + vehicleInventory.getInventorySize());

	        String[] vehiclesToCheck = {"Car", "Truck", "Motorcycle"};
	        for (String vehicle : vehiclesToCheck) {
	            System.out.println(vehicle + " Frequency: " + vehicleInventory.getFrequency(vehicle));
	        }
	    }
	}