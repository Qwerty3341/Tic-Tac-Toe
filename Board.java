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
        return this.table[cellNumberX][cellNumberY];
    }

    public void printBoard(){

        System.out.println();
        for (char[] row : table) {
            for (char column : row) {
                System.out.print(String.format("[%s]", column));
            }
            System.out.println();
        }
        System.out.println();
    }

    
}