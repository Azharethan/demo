class Mythread extends Thread {
	public void run() {
		System.out.println("Child Thread");
	}
}

public class demo {
	public static void main(String[] args) {
		System.out.println("main thread");
		Mythread t = new Mythread();
		t.start();

	}
}
