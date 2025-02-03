import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number (1-4): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Option 1 selected.");
                break;
            case 2:
                System.out.println("Option 2 selected.");
                break;
            case 3:
                System.out.println("Option 3 selected.");
                break;
            case 4:
                System.out.println("Option 4 selected.");
                break;
            default:
                System.out.println("Invalid option. Please select a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}
