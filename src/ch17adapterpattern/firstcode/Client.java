package ch17adapterpattern.firstcode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target target=new Adapter();
		target.request();
	}

}
