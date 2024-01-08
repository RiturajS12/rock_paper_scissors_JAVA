import java.util.*;

public class rock_paper_scissors {
    public void options() {
        int ch = 0;
        while (ch != 4) {
    
            System.out.println("Enter your choice\n1.Rock\n2.Paper\n3.Scissors\n4.Exit the game.");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            String computerChoice = randomChoice();

            if (ch == 1 && computerChoice.equals("rock")) {
                draw();
            } else if (ch == 2 && computerChoice.equals("paper")) {
                draw();
            } else if (ch == 3 && computerChoice.equals("scissors")) {
                draw();
            } else if (ch == 1 && computerChoice.equals("paper")) {
                System.out.println("Sorry, you lost. Computer's " + computerChoice + " covered your rock!");
            } else if (ch == 1 && computerChoice.equals("scissors")) {
                System.out.println("Wohoo, you got this! Your rock destroyed computer's " + computerChoice);
            } else if (ch == 2 && computerChoice.equals("rock")) {
                System.out.println("Wohoo, you nailed it! Your paper fully covered the computer's " + computerChoice);
            } else if (ch == 2 && computerChoice.equals("scissors")) {
                System.out.println("UH OH! You made it wrong this time. Your paper was cut by computer's " + computerChoice);
            } else if (ch == 3 && computerChoice.equals("rock")) {
                System.out.println("Man, you lost this time. Computer's " + computerChoice + " destroyed your scissors.");
            } else if (ch == 3 && computerChoice.equals("paper")) {
                System.out.println("Wohoo, you got this! Your scissors cut off the computer's " + computerChoice);
            }
        }
    }

    public String randomChoice() {
        Random rand = new Random();
        String game[] = {"rock", "paper", "scissors"};
        int a = game.length;
        int randomIndex = rand.nextInt(a);
        return game[randomIndex];
    }

    public void draw() {
        System.out.println("You and computer have the same element. So I guess we can call it a draw for now!! Why don't you try for another round?");
    }

    public static void main(String[] args) {
        rock_paper_scissors obj = new rock_paper_scissors();
        obj.options();
    }
}
