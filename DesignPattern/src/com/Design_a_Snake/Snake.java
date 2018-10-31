package com.Design_a_Snake;

import java.util.LinkedList;

/**
 * Now, the Snake class, which contains the body and head. We have used
 * LinkedList to store the body because we can add a cell in O(1). Grow method
 * will be called when it eats the food. Other methods are self-explanatory.
 * 
 */

public class Snake {

	private LinkedList<Cell> snakePartList = new LinkedList<>();

	private Cell head;

	public Snake(Cell initPos) {
		head = initPos;
		snakePartList.add(head);
	}

	public void grow() {
		snakePartList.add(head);
	}

	public void move(Cell nextCell) {
		System.out.println("Snake is moving to " + nextCell.getRow() + " " + nextCell.getCol());

		Cell tail = snakePartList.removeLast();
		tail.setCellType(CellType.Empty);

		head = nextCell;
		snakePartList.addFirst(head);
	}

	public boolean checkCrash(Cell nextcell) {
		System.out.println("Going to check for Crash");
		for (Cell cell : snakePartList) {
			if (cell == nextcell) {
				return true;
			}
		}
		return false;

	}

	public LinkedList<Cell> getSnamePartList() {
		return snakePartList;
	}

	public void setSnakePartList(LinkedList<cell> snakePartList) {
		this.snakePartList = snakePartList;
	}

	public Cell getHead() {
		return head;
	}

	public void setHead(Cell head) {
		this.head = head;
	}

}
