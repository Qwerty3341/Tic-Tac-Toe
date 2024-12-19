import java.util.Scanner;

public class Game {
    
    public static char requestPlayerName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 = ");
        char aPlayer = input.next().charAt(0);
        
        return aPlayer;
    }

    public static void play(){
        // Make the instance for the players
        Player player1 = new Player(requestPlayerName());
        Player player2 = new Player(requestPlayerName());

        // Beggin the turnovers
        Boolean victory = false;
        while (victory == false) {
            
        }


    }
}
