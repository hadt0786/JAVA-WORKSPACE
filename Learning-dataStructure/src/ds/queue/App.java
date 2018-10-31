package ds.queue;

public class App {
	public static void main (String[] args) {
		Qeueue queue = new Qeueue(5);
		queue.insert(100);
		queue.insert(200);
		queue.insert(300);
		queue.insert(400);
		queue.insert(500);
		queue.insert(100);//got the exception initialise to only haave 5 elements throws ArryINdexoutofBounds
		
		queue.view();
	}
}
