import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    private static final String[] FANCY_GREETINGS = {
            "Greetings, esteemed", "Salutations, distinguished", "Welcome, illustrious",
            "Hail, noble", "Good day, venerable", "Well met, honorable"
    };

    public static void main(String[] args) throws InterruptedException {
        Scanner royalScribe = new Scanner(System.in);
        Random fateDecider = new Random();

        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║   Welcome to the Grand Name Greeter   ║");
        System.out.println("╚═══════════════════════════════════════╝");

        System.out.print("Pray, bestow upon us thy illustrious name: ");
        String exaltedName = royalScribe.nextLine();

        System.out.println("\nPreparing a grand salutation...");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            TimeUnit.MILLISECONDS.sleep(500);
        }
        System.out.println("\n");

        String chosenGreeting = FANCY_GREETINGS[fateDecider.nextInt(FANCY_GREETINGS.length)];

        System.out.println("╭───────────────────────────────────╮");
        System.out.printf("│ %s %s! │\n", chosenGreeting, exaltedName);
        System.out.println("╰───────────────────────────────────╯");

        System.out.println("\nMay your code be bug-free and your algorithms efficient!");
    }
}