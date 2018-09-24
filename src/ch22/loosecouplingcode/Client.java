package ch22.loosecouplingcode;

import org.omg.PortableServer.AdapterActivator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandsetBrand ab;
		ab=new HandsetBrandN();
		ab.setSoftware(new HandsetGame());
		ab.run();
		
		ab.setSoftware(new HandsetAdressList());
		ab.run();
		
		ab.setSoftware(new HandsetMP3());
		ab.run();
		
		ab=new HandsetBrandM();
		ab.setSoftware(new HandsetGame());
		ab.run();
		ab.setSoftware(new HandsetAdressList());
		ab.run();
		ab.setSoftware(new HandsetMP3());
		ab.run();
	}

}
