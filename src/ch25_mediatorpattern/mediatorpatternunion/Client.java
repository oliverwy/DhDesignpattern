/**
 *
 */
package ch25_mediatorpattern.mediatorpatternunion;

/**
 * @author oliver
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UnitedNationSecurityCouncil UNSC = new UnitedNationSecurityCouncil();
        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);
        UNSC.setM1(c1);
        UNSC.setM2(c2);

        c1.declare("不准研制核武器，否则我就发动战争！");
        c2.declare("我没有核武器，但我不怕侵略");
    }

}
