package ch25_mediatorpattern.mediatorpatternunion;

public class UnitedNationSecurityCouncil implements UnitedNations {
    private USA m1;
    private Iraq m2;

    public USA getM1() {
        return m1;
    }

    public void setM1(USA m1) {
        this.m1 = m1;
    }

    public Iraq getM2() {
        return m2;
    }

    public void setM2(Iraq m2) {
        this.m2 = m2;
    }

    @Override
    public void declare(String message, Country colleague) {
        // TODO Auto-generated method stub
        if (colleague == m1) {
            System.out.println(message);
            m2.getMessage(message);
        } else {
            System.out.println(message);
            m1.getMessage(message);
        }
    }

}
