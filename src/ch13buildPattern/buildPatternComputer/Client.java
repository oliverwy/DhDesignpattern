package ch13buildPattern.buildPatternComputer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		ComputerDirector cd = new ComputerDirector();
		MateBookXPro mx = new MateBookXPro();
		mx.setCtype("I716GB1TB");
		mx.setModel("MateBook X Pro 2018");
		cd.setCbp(mx);
		for (i = 0; i < 10; i++) {
			mx.setSN(String.valueOf(i));
			cd.assembleComputer();
		}
		MagicBookPro mbp = new MagicBookPro();
		mbp.setCtype("i7 16GB 1TB 独显MX250");
		mbp.setModel("MagicBook Pro 科技创新版");

		cd.setCbp(mbp);

		for (int j = 0; j < 10; j++) {
			mbp.setSN(String.valueOf(j));
			cd.assembleComputer();
		}
	}

}
