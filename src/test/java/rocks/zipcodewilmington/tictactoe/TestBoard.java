package rocks.zipcodewilmington.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 6/20/18.
 */
public class TestBoard {

    private Board board;

    @Before
    public void setup() {
        // Given
        this.board = new Board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
    }

    @Test
    public void TestBoardInitialize() {
        Assert.assertEquals(8, this.board.getLinesToCheckSize());
    }

    @Test
    public void TestCheckLine() {
    	Assert.assertTrue(this.board.checkLine("XXX"));
    	Assert.assertTrue(this.board.checkLine("OOO"));
    	Assert.assertFalse(this.board.checkLine(""));
    }
    
    @Test
    public void TestCheckWhichLine() {
    	Assert.assertEquals("X", this.board.checkWhichLine("XXX"));
    	Assert.assertEquals("O", this.board.checkWhichLine("pandafart"));
    }
    

    @Test
    public void isInFavorOfPlayerOTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.isInFavorOfO();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isInFavorOfPlayerXTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.isInFavorOfX();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTieTest() {
        // Given
        Boolean expected = true;

        // When
        Boolean actual = board.isTie();

        // Then
        Assert.assertEquals(expected, actual);

    }
}

