
package test.java.is.jatj.tictactoe.game;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.princeton.cs.algs4.StdOut;

public class unitTest{
	// usesless comment
	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("src.TicTacToe.unitTest");
	    }
		TicTacToe game = new TicTacToe();

		@Test
		public void testEmptyString() {
			
			game.makeMove(1, 0);
			assertEquals('O', game.getChar(1));
		}

		@Test
		public void testmove() {
			assertEquals(true, game.isMoveLegal(1));
		}
		@Test
		public void testmovetohigh() {
			assertEquals(false, game.isMoveLegal(11));
		}
		@Test
		public void testmovenegative() {
			assertEquals(false, game.isMoveLegal(-1));
		}
		@Test
		public void testmoveDoneBefore() {
			game.makeMove(1, 0);
			assertEquals(false, game.isMoveLegal(1));
		}
		
		@Test
		public void testTwoNumbers() {
			game.makeMove(0, 0);
			game.makeMove(1, 0);
			game.makeMove(2, 0);
			assertEquals(true, game.checkForWinner());
			
		}	

		
	
}