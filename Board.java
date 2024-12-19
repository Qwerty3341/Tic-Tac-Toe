public class Board {
    
    private char[][] table;

    public Board(){
        this.table = new char[3][3];

        // Initialize the board with numbers 1 to 9
        table[0] = new char[]{'1','2','3'};
        table[1] = new char[]{'4','5','6'};
        table[2] = new char[]{'7','8','9'};
        
    }

    public char getCell(int cellNumberX, int cellNumberY){
        return (char) this.table[cellNumberX][cellNumberY];
    }

    public void printBoard(){
        for (char[] row : table) {
            for (char column : row) {
                System.out.print(String.format("[%s]", column));
            }
            System.out.println();
        }
    }

    public void setPlayerInCell(char playerInput){
        for(int row = 0; row <= 2; row++){
            for (int col = 0; col <= 2; col++) {
                if (this.table[row][col] == playerInput) {
                    this.table[row][col] = playerInput;
                }
            }
        }
    }
    
}