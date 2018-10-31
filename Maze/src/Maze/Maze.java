package Maze;

import javax.swing.JFrame;

public class Maze {
	
	public static void main(String[] args) {
		new Maze();
	}
	
	public Maze() {
		JFrame f = new JFrame();
		f.setTitle(("Maze Game"));
		
		f.add(new Board());
		
		//setTule --> will set the title of the Frae
		f.setSize(464, 485);
		
		//%00 is the width and 400 is the height
		f.setLocationRelativeTo(null);
		
		f.setVisible(true);
		
		//clicking on close button to exit the button
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
