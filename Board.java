public class Board {
    
    private byte[][] table;

    public Board(){
        this.table = new byte[3][3];

        // Initialize the board with numbers 1 to 9
        byte counter = 1;
        for(byte row = 0; row <= 2; row++){
            for(byte column = 0; column <= 2; column++){
                this.table[row][column] = counter++;
            }
        }

    }

    public char getCell(byte cellNumberX, byte cellNumberY){
        return (char) this.table[cellNumberX][cellNumberY];
    }

    public void printBoard(){
        for (byte[] row : table) {
            for (byte column : row) {
                System.out.print(String.format("[%s]", column));
            }
            System.out.println();
        }
    }
    
}