package Maze;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {

	private int x, y, tileX, tileY;
	private Image player;
	
	public Player() {
		
		ImageIcon img = new ImageIcon("..//imageIcon.png");
		player = img.getImage();
		this.x = 32;
		this.y = 32;
		this.tileX = 1;
		this.tileY = 1;
	}
	
	public Image getPlayer() {
		return player;
	}
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	/**
	 * @param x --> 
	 * 
	 * */
	public void move(int dx, int dy, int tx, int ty) {
		this.x+=dx;
		this.y+=dy;
		
		this.tileX +=tx;
		this.tileY +=ty;
		
	}
	
	
	
}
