public class HangmanArt {
    public String stage(int count){
        String[] stages = {
                "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |=========",
                "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
                "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
                "  +---+\n  |   |\n      |\n      |\n      |\n      |\n========="
        };
        return stages[count];
    }

    public static void main(String[] args) {

    }
}
