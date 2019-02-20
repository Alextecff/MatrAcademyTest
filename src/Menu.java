import java.util.Scanner;

public class Menu {
    private int choice;
    private String[] values = new String[2];

    public int getChoice() {
        return choice;
    }

    public String[] getValues() {
        return values;
    }

    Scanner scanner = new Scanner(System.in);

    {
        System.out.println("Enter first number:");
        values[0] = scanner.nextLine();
        System.out.println("Enter second number:");
        values[1] = scanner.nextLine();
    }

    public void menu() {
        System.out.println("Select operation(1 - 4):");
        System.out.println("1 - The sum +");
        System.out.println("2 - Subtraction - ");
        System.out.println("3 - Multiplication *");
        System.out.println("4 - Division /");
        choice = scanner.nextInt();
    }
}
