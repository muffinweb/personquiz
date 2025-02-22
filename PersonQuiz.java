import java.util.Scanner;

public class PersonQuiz
{
    public static void main(String[] args)
    {
        // Scanner instance
        Scanner scanner = new Scanner(System.in);

        // Ask question about name
        System.out.println("What's your name: ?");

        // Get given name value and assign it to name variable
        String name = scanner.nextLine();

        // Ask question about surname
        System.out.println("What's your surname: ?");

        // Get given name value and assign it to name variable
        String surname = scanner.nextLine();

        // Show result
        System.out.println("Welcome to CLI " + name + " " + surname);

    }
}