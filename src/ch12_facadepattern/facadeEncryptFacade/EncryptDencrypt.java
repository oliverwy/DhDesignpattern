package ch12_facadepattern.facadeEncryptFacade;

public class EncryptDencrypt {
    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文:");
        String esString = "";
        char[] chars = plainText.toCharArray();
        for (char c : chars) {
            char temp = (char) (Integer.valueOf(c) - 5);
            esString = esString + temp;
        }
        System.out.println(esString);
        return esString;
    }

    public String deencrypyt(String encryptText) {
        System.out.println("数据解密，将密文转换为明文:");
        String deString = "";
        char[] chars = encryptText.toCharArray();
        for (char c : chars) {
            char temp = (char) (Integer.valueOf(c) + 5);
            deString = deString + temp;
        }
        System.out.println(deString);
        return deString;
    }
}
