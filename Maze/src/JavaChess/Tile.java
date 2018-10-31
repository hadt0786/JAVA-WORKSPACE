package JavaChess;

/*
 * Created by 
 *@author AKASH MOHAN CHAUDHARY on 27 Aug 2018
 * **/

public abstract class Tile {

	int tileCoordinate;

	public Tile(int tileCoordinate) {

		this.tileCoordinate = tileCoordinate;
	}

	// abstarct method not going to define in this class but in abstract class
	public abstract boolean isTileOccupied();

	public abstract Piece getPiece();

	public static final class EmptyTile extends Tile {

		EmptyTile(int coordinate) {
			super(coordinate);
		}

		@Override
		public boolean isTileOccupied() {
			return false;
		}

		@Override
		public Piece getPiece() {

			return null;
		}

	}

}
