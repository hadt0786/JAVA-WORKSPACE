package com.Design_a_Snake;

/**
 * The Cell class represents the one point of dispaly / board. It contains the
 * row no, column no and the information about it i.e. is is empty or there is a
 * food on it or is it a part of snake body?
 */

public class Cell {

	private final int row, col;
	private CellType cellType;

	public CellType getCellType() {
		return cellType;
	}

	public void setCellType(CellType cellType) {
		this.cellType = cellType;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public Cell(int row, int col) {

		this.row = row;
		this.col = col;

	}

}
