package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] boardGrid;

    public Board(Character[][] matrix) {
        boardGrid = matrix;
    }

    public Boolean isInFavorOfX() {
        return getWinner() == "O";
    }

    public Boolean isInFavorOfO() {
        return getWinner() == "X";
    }

    public Boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() {
        for (int a = 0; a < 8; a++) {
            String line = "";
            switch (a) {
                case 0:
                    line = this.boardGrid[0][0].toString() + this.boardGrid[0][1].toString() + this.boardGrid[0][2].toString();
                    if (line.equals("XXX")) {
                        return "X";
                    } else if (line.equals("OOO")) {
                        return "O";
                    }
                    break;
                case 1:
                    line = this.boardGrid[1][0].toString() + this.boardGrid[1][1].toString() + this.boardGrid[1][2].toString();
                    break;
                case 2:
                    line = this.boardGrid[2][0].toString() + this.boardGrid[2][1].toString() + this.boardGrid[2][2].toString();
                    break;
                case 3:
                    line = this.boardGrid[0][0].toString() + this.boardGrid[1][0].toString() + this.boardGrid[2][0].toString();
                    break;
                case 4:
                    line = this.boardGrid[0][1].toString() + this.boardGrid[1][1].toString() + this.boardGrid[2][1].toString();
                    break;
                case 5:
                    line = this.boardGrid[0][2].toString() + this.boardGrid[1][2].toString() + this.boardGrid[2][2].toString();
                    break;
                case 6:
                    line = line = this.boardGrid[0][0].toString() + this.boardGrid[1][1].toString() + this.boardGrid[2][2].toString();
                    break;
                case 7:
                    line = line = this.boardGrid[2][0].toString() + this.boardGrid[1][1].toString() + this.boardGrid[0][2].toString();
                    break;
            }


            if (line.equals("XXX")) {
                System.out.println("Found an X column!");
                return "X";
            } else if (line.equals("OOO")) {
                System.out.println("Found an 0 column!");
                return "O";
            }
        }

        return "";
    }

}
