import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Show total unique count
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        // Program continues...
        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}