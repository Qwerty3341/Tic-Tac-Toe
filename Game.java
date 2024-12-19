import java.util.Scanner;

public class Game {

    private static char playerInput(Player aPlayer){
        Scanner input = new Scanner(System.in);
        System.out.print("Player " + aPlayer.getName() + " turn = ");
        char cell = input.next().charAt(0);
        input.nextLine();
        return cell;
    }

    public static void play(){
        // Make the instance for the players
        Scanner input = new Scanner(System.in);

        System.out.print("Player 1 = ");
        char p1 = input.next().charAt(0);
        Player player1 = new Player(p1);

        System.out.print("Player 2 = ");
        char p2 = input.next().charAt(0);
        Player player2 = new Player(p2);

        Board aBoard = new Board();

        // Start the game
        boolean victory = false;
        byte turn = 0;
        
        while (victory == false) {
        
            aBoard.printBoard();

            if (turn % 2 == 0) { // Turns for player 1
                // aBoard.setPlayerInCell(playerInput(player1));
                
            }
            if(turn % 2 != 0){ // Turns for player 2
                // aBoard.setPlayerInCell(playerInput(player2));
                
            }

            if (Checker.checkVictory(aBoard, player1) == true || Checker.checkVictory(aBoard, player2) == true) {
                victory = true;
            }

            turn++;
        }
        aBoard.printBoard();
        System.out.println("Player " + (turn % 2 == 0 ? player2.getName() : player1.getName()) + " won");
    }
}