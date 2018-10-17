package ch12facadepattern.facadeEncryptFacade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReader {
	public String read(String fileNameSrc) throws FileNotFoundException
	,IOException
	{
		System.out.println("以字节为单位读取文件内容，一次读一个字节：");
		File fs=new File(fileNameSrc);
		String result = null;
		InputStream in=null;
		in= new FileInputStream(fs);
		byte[] bs=new byte[(int) fs.length()];
		in.read(bs);
		result=new String(bs);
		in.close();
		System.out.println(result);
		return result;
	}
}
