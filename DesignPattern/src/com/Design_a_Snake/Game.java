package com.Design_a_Snake;

/**
 * Design Snake Game Let us see how to design a basic Snake Game which provides
 * the following functionalities:
 * 
 * • Snake can move in a given direction and when it eats the food, the length
 * of snake increases. • When snake crosses itself, the game will over. • Food
 * will be generated at given interval.
 * 
 * Asked In: Amazon, Microsoft, and many more interviews This question is asked
 * in interviews to Judge the Object Oriented Design skill of a candidate. So,
 * first of all we should think about the classes.
 * 
 * The main classes will be:
 * 
 * 1. Snake 2. Cell 3. Board 4. Game
 * 
 * 
 * 
 * The class Game represents the body of our program. It stores information
 * about the snake and the board.
 */

public class Game {

	private static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1, DIRECTION_LEFT = -1, DIRECTION_UP = 2,
			DIRECTION_DOWN = -2;

	private Snake snake;
	private Board board;
	
	private int direction;
	private boolean gameOver;
	
	public Game(Snake snake, Board board) {
	
		this.snake = snake;
		this.board = board;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}


    // We need to update the game at regular intervals, 
    // and accept user input from the Keyboard. 
	
	public void update() {
		
	}
	
}
