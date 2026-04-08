import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        // Add Passenger Bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies (READ)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Check Existence (READ)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        // Program continues...
        System.out.println("\nSystem ready for further operations.");
    }
}