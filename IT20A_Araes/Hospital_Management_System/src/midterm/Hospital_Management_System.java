
import java.util.*;

class Patient {

    String name;
    int severity;

    Patient(String n, int s) {
        name = n;
        severity = s;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class Hospital_Management_System {

    public static void main(String[] args) {
        Queue<Patient> arrival = new LinkedList<>();
        PriorityQueue<Patient> treatment = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));

        // Admit patients
        arrival.add(new Patient("Anna", 3));
        arrival.add(new Patient("Bob", 1));
        arrival.add(new Patient("Carla", 2));
        arrival.add(new Patient("Dave", 1));
        treatment.addAll(arrival);

        System.out.println("=== Arrival Order ===");
        System.out.println("Arrival Order: " + arrival);

        System.out.println("\n=== Treatment Order ===");
        while (!treatment.isEmpty()) {
            System.out.println("Treating: " + treatment.poll());
        }
    }
}
