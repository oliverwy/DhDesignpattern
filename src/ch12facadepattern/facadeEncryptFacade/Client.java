package ch12facadepattern.facadeEncryptFacade;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EncryptFacade f=new EncryptFacade();
		System.out.println("加密文件：");
		f.fileEncrypt("src.txt", "des.txt");
		
		System.out.println("解密文件：");
		f.fileDencrypt("des.txt", "dsrc.txt");
	}

}
