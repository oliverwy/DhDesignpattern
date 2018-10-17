package ch12facadepattern.facadeEncryptFacade;

import java.io.IOException;

public class EncryptFacade {
	private FileReader reader;
	private EncryptDencrypt enDencrypt;
	private FileWriter writer;
	public EncryptFacade() {
		super();
		this.reader = new FileReader();
		this.enDencrypt = new EncryptDencrypt();
		this.writer = new FileWriter();
	}
	public void fileEncrypt(String fileNameSrc,String fileNameDes) throws IOException {
		String plainStr=reader.read(fileNameSrc);
		String encryptStr=enDencrypt.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}
	public void fileDencrypt(String fileNameEncode,String fileNameDecode) throws IOException {
		String encryptText=reader.read(fileNameEncode);
		String plainStr=enDencrypt.deencrypyt(encryptText);
		writer.write(plainStr, fileNameDecode);
	}

}
