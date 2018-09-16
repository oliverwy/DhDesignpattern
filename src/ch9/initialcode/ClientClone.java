package ch9.initialcode;

public class ClientClone {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Resume a = new Resume("大鸟");
        a.setPersionInfo("男", "29");
        a.setWorkExprience("1998-2000", "XXXX公司");
        Resume b = a;
        Resume c = a;
        Resume d = a;

        a.display();
        b.display();
        c.display();
        d.display();
    }
//>>>>>>> c8419c8a52c512e300f261ea04986559973a1601

}
