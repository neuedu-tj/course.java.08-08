package design.singleton.thread;


public class Test2 {

	public static void main(String[] args) {

		Handler h= new Handler();

		for (int i = 0; i < 10000; i++) {
			new Thread(h).start();   // start 调用了  h 中的  run 方法 .
		}


		System.out.println(h.getConns());


	}

}
