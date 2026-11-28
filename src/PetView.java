import java.util.Scanner;

public class PetView {
    private final Scanner scanner;

    public PetView(){
        this.scanner = new Scanner(System.in);
    }

    public void hasPetMenu(){
        System.out.println("1. Feed Pet");
        System.out.println("2. Play with Pet");
        System.out.println("3. Exit");
        System.out.println("\n==============================");
        System.out.println("STATUS: " ); //petName
        System.out.println("Hunger: "  " | Happiness: "  " | Energy: " );
        System.out.println("==============================");
    }
    public void noPetMenu(){
        System.out.println("\n--- Virtual Pet Menu ---");
        System.out.println("1. Create Pet");
        System.out.println("2. Exit");

    }
    public void createPetName(){
        System.out.print("Enter pet name: ");
        String petName = scanner.nextLine();
    }
    public void choiceInput(){
        System.out.print("Choice: ");
        String choice = scanner.nextLine();
    }
}
