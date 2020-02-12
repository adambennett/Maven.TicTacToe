package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] boardGrid;
    private String topLeft;
    private String topRight;
    private String topMid;
    private String botLeft;
    private String botRight;
    private String botMid;
    private String midLeft;
    private String midMid;
    private String midRight;
    private ArrayList<String> linesToCheck = new ArrayList<>();

    public Board(Character[][] matrix) {
    	this.boardGrid = matrix;
        this.linesToCheck = new ArrayList<>();
        this.topLeft = this.boardGrid[0][0].toString();
        this.topRight = this.boardGrid[0][2].toString();
        this.topMid = this.boardGrid[0][1].toString();
        this.botLeft = this.boardGrid[2][0].toString();
        this.botRight = this.boardGrid[2][2].toString();
        this.botMid = this.boardGrid[2][1].toString();
        this.midLeft = this.boardGrid[1][0].toString();
        this.midMid = this.boardGrid[1][1].toString();
        this.midRight = this.boardGrid[1][2].toString();
        this.linesToCheck.add(topLeft + topMid + topRight);
        this.linesToCheck.add(midLeft + midMid + midRight);
        this.linesToCheck.add(botLeft + botMid + botRight);
        this.linesToCheck.add(topLeft + midLeft + botLeft);
        this.linesToCheck.add(topMid + midMid + botMid);
        this.linesToCheck.add(topRight + midRight + botRight);
        this.linesToCheck.add(topLeft + midMid + botRight);
        this.linesToCheck.add(botLeft + midMid + topRight);
    }
    
    public int getLinesToCheckSize() {
    	return this.linesToCheck.size();
    }

    public Boolean isInFavorOfX() {
        return getWinner() == "X";
    }

    public Boolean isInFavorOfO() {
        return getWinner() == "O";
    }

    public Boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() 
    {
    	for (String line : linesToCheck) {
    		if (checkLine(line)) {
    			return checkWhichLine(line);
    		}
    	}
        return "";
    }
    
    public boolean checkLine(String line) {
    	if (line.equals("XXX") || line.equals("OOO")) { return true; }     	
    	return false;
    }
    
    public String checkWhichLine(String line) {
    	if (line.equals("XXX")) { return "X"; } 
    	else { return "O"; }
    }

}
