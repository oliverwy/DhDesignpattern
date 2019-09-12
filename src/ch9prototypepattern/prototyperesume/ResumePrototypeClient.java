package ch9prototypepattern.prototyperesume;

public class ResumePrototypeClient { //

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Resume a = new Resume("大鸟");
        a.setPersionInfo("男", "29");
        a.setWorkExprience("1998-2000", "XXXX公司");

        Resume b = (Resume) a.Clone();
        b.setWorkExprience("1998-2006", "YY企业");

        Resume c = (Resume) a.Clone();
        c.setPersionInfo("女", "22");

        a.display();
        b.display();
        c.display();

    }

}
