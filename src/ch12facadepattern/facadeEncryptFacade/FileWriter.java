package ch12facadepattern.facadeEncryptFacade;

import java.io.*;

public class FileWriter {
    public void write(String encryptStr, String fileNameDes) throws IOException,
            FileNotFoundException {
        System.out.println("处理后的文件");
        File fs = new File(fileNameDes);
        OutputStream outputStream = null;
        if (!fs.exists())
            fs.createNewFile();
        outputStream = new FileOutputStream(fs);
        byte[] str = encryptStr.getBytes();
        outputStream.write(str);
        outputStream.flush();
        outputStream.close();
    }

}
