import java.util.Scanner;

public class Game {
    
    private static char requestPlayerName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 = ");
        char aPlayer = input.next().charAt(0);
        
        return aPlayer;
    }

    private static void playerInput(Player aPlayer){
        Scanner input = new Scanner(System.in);
        System.out.print("Player" + aPlayer.getName() + "turn = ");
        
    }

    public static void play(){
        // Make the instance for the players
        Player player1 = new Player(requestPlayerName());
        Player player2 = new Player(requestPlayerName());

        Board aBoard = new Board();

        // Start the game
        Boolean victory = false;
        while (victory == false) {
            
            

            
            // check the winner



        }


    }
}
