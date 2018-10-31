package Arrays;

/**
 * Class for storinghigh score in an array in non decreasing order
 * */
public class Scoreboard {

	private int numEntries = 0;
	
	private GameEntry[] board;

	public Scoreboard(int capacity) {
	
		board = new GameEntry[capacity];
	}
	
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		//is the new Entry is really a high score?
		
		if(numEntries<board.length|| newScore>board[numEntries-1].getScore()) {
			if(numEntries<board.length)numEntries++;
			
		}
	}
	
	
	
}
