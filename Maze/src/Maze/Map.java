package Maze;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {

	private Scanner m;

	private Image grass, wall;

	private String Map[] = new String[16];

	public Map() {
		// Path of the file
		ImageIcon img = new ImageIcon("..//grass.png");
		grass = img.getImage();

		img = new ImageIcon("..//wall.png");
		wall = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass() {
		return grass;
	}
	public Image getWall() {
		return wall;
	}

	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;
	}

	public void setMap(String[] map) {
		Map = map;
	}

	private void openFile() {

		try {

			m = new Scanner(new File("..//test/tutorial//Map.txt"));

		} catch (FileNotFoundException e) {
			System.out.println("Error loading map");
			e.printStackTrace();
		}
	}

	private void readFile() {
		while (m.hasNext()) {
			for (int i = 0; i < 14; i++) {
				Map[i] = m.next();
			}
		}

	}

	private void closeFile() {
		m.close();
	}

}
