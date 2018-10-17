package ch12facadepattern.facadeEncryptFacade;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ClientProtype {

	public static void main(String[] args)
			throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader();
		EncryptDencrypt enDencrypt=new EncryptDencrypt();
		FileWriter writer=new FileWriter();
		
		System.out.println("加密文件：");
		String plainStr=reader.read("src.txt");
		String encryptStr=enDencrypt.encrypt(plainStr);
		writer.write(encryptStr, "desprotype.txt");
		
		System.out.println("解密文件：");
		String enStr=reader.read("desprotype.txt");
		String proStr=enDencrypt.deencrypyt(enStr);
		writer.write(proStr, "srcprotype.txt");

	}

}
