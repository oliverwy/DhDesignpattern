package principlesofSoftwareDesign.OpenClosePrinciple;

public class CompareHouse extends CompareObject {

    @Override
    protected boolean isAccept(Object arg1, Object arg2) {
        if ((arg1 instanceof House) && (arg2 instanceof House)) {
            return true;
        }
        return false;
    }

    @Override
    public Object getMax() {
        if (((House) object1).getSquare() > ((House) object2).getSquare()) {
            return (House) object1;
        }
        return (House) object2;
    }

    @Override
    public Object getMin() {
        if (((House) object1).getSquare() > ((House) object2).getSquare()) {
            return (House) object2;
        }
        return (House) object1;
    }

    public Object getCheaper() {

        return null;
    }
}
