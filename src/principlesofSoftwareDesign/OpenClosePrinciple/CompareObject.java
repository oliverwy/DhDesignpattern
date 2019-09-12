package principlesofSoftwareDesign.OpenClosePrinciple;

public abstract class CompareObject {

    protected Object object1;
    protected Object object2;

    public void setData(Object arg1, Object arg2) {

        if (isAccept(arg1, arg2)) {
            object1 = arg1;
            object2 = arg2;
        } else {
            throw new RuntimeException(arg1 + " and " + arg2 + " isn't the them type ");
        }

    }

    protected abstract boolean isAccept(Object arg1, Object arg2);

    public abstract Object getMax();

    public abstract Object getMin();
}
