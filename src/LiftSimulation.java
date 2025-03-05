// Lift Simulation
import java.util.Scanner;

class Lift {
    private int currentFloor;
    private int maxFloor;

    public Lift(int maxFloor) {
        this.currentFloor = 0;
        this.maxFloor = maxFloor;
    }

    public void moveToFloor(int requestedFloor) {
        if (requestedFloor == currentFloor) {
            System.out.println("You are already on floor " + currentFloor);
            return;
        }

        if (requestedFloor < 0 || requestedFloor > maxFloor) {
            System.out.println("Invalid floor!");
            return;
        }
        System.out.println("Moving from floor " + currentFloor + " to floor " + requestedFloor);
        currentFloor = requestedFloor;
        System.out.println("Lift has arrived at floor " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

public class LiftSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lift lift = new Lift(10); // Lift can go up to 10 floors

        while (true) {
            System.out.println("Current floor: " + lift.getCurrentFloor());
            System.out.println("Enter floor to go to (0-10) or -1 to exit: ");

            int requestedFloor;
            try {
                requestedFloor = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number between 0 and 10.");
                scanner.next(); // Clear invalid input
                continue;
            }

            if (requestedFloor == -1) break;

            lift.moveToFloor(requestedFloor);
        }
        scanner.close();
    }
}
