import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialize the answer before loop
        char answer;

        //while do loop because first game is obligated
        do {
            //create game object
            Game game = new Game();

            //everything about playing is in method of play
            game.play();
            System.out.println();
            System.out.print("Play again?  (y/n): ");
            answer = input.next().charAt(0);

        }while(answer == 'y');
        System.out.println("Thanks for playing - Goodbye!");
    }
}
