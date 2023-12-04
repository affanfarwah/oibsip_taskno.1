import java.util.Scanner;

public class GuessTheNumber {
    // Method to return the hangman stages based on the incorrect guesses
    static String stage(int count) {
        String[] stages = {
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n========="
        };
        return stages[count];
    }

    public static void main(String[] args) {
        // Hangman ASCII art logo
        String logo = " \n" +
            " _                                              \n" +
            "| |                                            \n" +
            "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
            "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
            "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
            "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
            "                    __/ |                      \n" +
            "                   |___/    ";

        System.out.println(logo);
        System.out.println("The Random Number is between 1 to 100 ");
        System.out.println("-----Welcome-----");

        int randomNum = randomNoFunc(); // Generate a random number
        boolean condition = true; // Condition for the while loop
        int count = 7; // Lives for hangman

        System.out.println("Enter the guess number: ");
        Scanner sc = new Scanner(System.in);

        while (condition) {
            if (count == 0) { // If no lives left
                System.out.println("You lose");
                System.out.println("Do you want to play again? Press 'y' else 'n': ");
                String repeat = sc.next();
                if (repeat.equals("y")) {
                    count = 7;
                    randomNum = randomNoFunc();
                    System.out.println("Enter the guess number: ");
                } else {
                    System.out.println("Thank you for playing :)");
                    condition = false;
                    break;
                }
            }

            int guess = sc.nextInt();

            if (guess == randomNum) { // If the correct number is guessed
                System.out.println("You Guessed the correct number\n...... YOU WON ......");
                System.out.println("Do you want to play again? Press 'y' else 'n': ");
                String repeat = sc.next();
                if (repeat.equals("y")) {
                    count = 7;
                    randomNum = rand();
                    System.out.println("Enter the guess number: ");
                } else {
                    System.out.println("Thank you for playing :)");
                    condition = false;
                    break;
                }
            } else { // If the wrong number is guessed, lives will decrease
                count--;
                System.out.println("-----Wrong-----");
                System.out.println("You are left with " + count + " lives");
                if (guess < randomNum) {
                    System.out.println("<Greater> than the guessed number");
                } else {
                    System.out.println("<Lesser> than the guessed number");
                }

                System.out.println(stage(count)); // Display hangman stage
            }
        }
        sc.close();
    }

    // Method to generate a random number between 1 and 100
    static int randomNoFunc() {
        int randomNum = (int) (Math.random() * 100) + 1;
        return randomNum;
    }
}
