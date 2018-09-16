package ch9.initialcode;

public class Client {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Resume a = new Resume("大鸟");
        a.setPersionInfo("男", "29");
        a.setWorkExprience("1998-2000", "XXXX公司");
        Resume b = new Resume("大鸟");
        b.setPersionInfo("男", "29");
        b.setWorkExprience("1998-2000", "XXXX公司");
        Resume c = new Resume("大鸟");
        c.setPersionInfo("男", "29");
        c.setWorkExprience("1998-2000", "XXXX公司");
        Resume d = new Resume("大鸟");
        d.setPersionInfo("男", "29");
        d.setWorkExprience("1998-2000", "XXXX公司");

        a.display();
        b.display();
        c.display();
        d.display();
    }
//>>>>>>> c8419c8a52c512e300f261ea04986559973a1601

}
