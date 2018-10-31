package Maze;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {

	private Timer timer;
	private Map m;
	private Player p;
	
	
	public Board() {
		
		m = new Map();
		p = new Player();
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int y = 0; y < 14; y++) {
			for (int x = 0; x < 14; x++) {
				if (m.getMap(x, y).equals("g")) {
					g.drawImage(m.getGrass(), x * 32, y * 32, null);
				}
				if (m.getMap(x, y).equals("w")) {
					g.drawImage(m.getWall(), x * 32, y * 32, null);
				}
			}
			
			g.drawImage(p.getPlayer(), p.getX(), p.getY(), null);
		}

		// g.setColor(Color.red);

		// filling a rectangle

		// g.fillRect(45, 60, 32, 32);

	}

	public class Al extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			if (keycode == KeyEvent.VK_W) {
				p.move(0, -32, 0, -1);
			}
			if (keycode == KeyEvent.VK_S) {
				p.move(0, 32, 0, 1);
			}
			if (keycode == KeyEvent.VK_A) {
				//moving toward negative x dire
				p.move(-32, 0, -1, 0);
			}
			if (keycode == KeyEvent.VK_D) {
				p.move(32, 0, 32, 0);
			} 
		}

		public void keyReleased(KeyEvent e) {

		}

		public void keyTyped(KeyEvent e) {

		}
	}

}
