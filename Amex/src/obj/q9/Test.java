package obj.q9;

public class Test extends Thread{
	
	public void rum() {
		System.out.println("HAck");
	}
	public void run(String s) {
		System.out.println("Build");
	}

	public static void main(String[] args) {

		new Test().start();

	}

}
