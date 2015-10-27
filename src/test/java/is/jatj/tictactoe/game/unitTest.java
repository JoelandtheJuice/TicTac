
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
		public void testcleanboard() {
			game.makeMove(0, 1);
			game.makeMove(3, 1);
			game.makeMove(4, 1);
			game.makeMove(2, 1);
			game.makeMove(8, 1);
			game.makeMove(6, 1);
			game.makeMove(7, 1);
			game.makeMove(1, 1);
			game.makeMove(5, 1);
			game.cleanBoard();
			char c[] = new char[9];
			c[0] = '1';
			c[1] = '2';
			c[2] = '3';
			c[3] = '4';
			c[4] = '5';
			c[5] = '6';
			c[6] = '7';
			c[7] = '8';
			c[8] = '9';
			
			int co = 0;
			for(int i = 0; i < 3; i++)
			{
				
				for(int j = 0; j < 3; j++)
				{
					
					assertEquals(c[co], game.board[i][j]);
					co++;
				}
			}
			
		}

		
	
}