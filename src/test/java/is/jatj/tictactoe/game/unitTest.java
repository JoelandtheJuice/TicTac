
package test.java.is.jatj.tictactoe.game;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.princeton.cs.algs4.StdOut;
import main.java.is.jatj.tictactoe.game.TicTacToe;

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

		@Test
		public void testWinnerV() {
			game.makeMove(0, 0);
			game.makeMove(3, 0);
			game.makeMove(6, 0);
			assertEquals(true, game.checkForWinner());
			
		}
		@Test
		public void testWinnerA() {
			game.makeMove(0, 0);
			game.makeMove(4, 0);
			game.makeMove(8, 0);
			assertEquals(true, game.checkForWinner());
			
		}
		@Test
		public void testplayerO() {
			game.makeMove(0, 0);
			assertEquals('O', game.board[0][0]);
		}	
		@Test
		public void testplayerX() {
			game.makeMove(0, 1);
			assertEquals('X', game.board[0][0]);
		}
		@Test
		public void testinitializePlayer() {
			game.initializePlayer();
			assertEquals('O', game.player[0]);
			assertEquals('X', game.player[1]);
		}

		
	
}