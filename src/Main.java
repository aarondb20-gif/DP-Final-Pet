import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String petName = "";
        int hunger = 50;
        int happiness = 50;
        int energy = 50;
        boolean hasPet = false;

        boolean running = true;
        while (running) {
            // Status is now automatically displayed at the start of every loop iteration
            if (hasPet) {
                System.out.println("\n==============================");
                System.out.println("STATUS: " + petName);
                System.out.println("Hunger: " + hunger + " | Happiness: " + happiness + " | Energy: " + energy);
                System.out.println("==============================");
            }

            System.out.println("\n--- Virtual Pet Menu ---");
            if (!hasPet) {
                System.out.println("1. Create Pet");
                System.out.println("2. Exit");
            } else {
                System.out.println("1. Feed Pet");
                System.out.println("2. Play with Pet");
                System.out.println("3. Exit");
            }
            System.out.print("Choice: ");

            String choice = scanner.nextLine();

            if (!hasPet) {
                if (choice.equals("1")) {
                    System.out.print("Enter pet name: ");
                    petName = scanner.nextLine();
                    hasPet = true;
                    System.out.println(petName + " has been born!");
                } else if (choice.equals("2")) {
                    running = false;
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                if (choice.equals("1")) {
                    hunger -= 15;
                    if (hunger < 0) hunger = 0;
                    happiness += 5;
                    if (happiness > 100) happiness = 100;
                    System.out.println("You fed " + petName + ".");
                } else if (choice.equals("2")) {
                    happiness += 20;
                    if (happiness > 100) happiness = 100;
                    energy -= 15;
                    if (energy < 0) energy = 0;
                    System.out.println("You played with " + petName + ".");
                } else if (choice.equals("3")) {
                    running = false;
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }

}
