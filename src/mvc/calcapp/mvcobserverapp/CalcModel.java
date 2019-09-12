package mvc.calcapp.mvcobserverapp;

import java.math.BigInteger;
import java.util.Vector;

//模型层提供数据
public class CalcModel implements Observable {
    // ... Constants
    private static final String INITIAL_VALUE = "１";
    private Vector<Observer> observersList;
    private boolean isBtnMultiplyClicked = false;
    private boolean isBtnClearClicked = false;
    // ... Member variable defining state of calculator.
    private BigInteger m_total; // The total current value state.

    /**
     * Constructor
     */
    CalcModel() {
        observersList = new Vector<Observer>();
        reset();
    }

    public boolean isBtnMultiplyClicked() {
        return isBtnMultiplyClicked;
    }

    public void setBtnMultiplyClicked(boolean isBtnMultiplyClicked) {
        this.isBtnMultiplyClicked = isBtnMultiplyClicked;
    }

    public boolean isBtnClearClicked() {
        return isBtnClearClicked;
    }

    // ============================================================== constructor

    public void setBtnClearClicked(boolean isBtnClearClicked) {
        this.isBtnClearClicked = isBtnClearClicked;
    }

    // ==================================================================== reset

    /**
     * Reset to initial value.
     */
    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }

    // =============================================================== multiplyBy

    /**
     * Multiply current total by a number.
     *
     * @param operand Number (as string) to multiply total by.
     */
    public void multiplyBy(String operand) {
        m_total = m_total.multiply(new BigInteger(operand));
    }

    // ================================================================= setValue

    /**
     * Return current calculator total.
     */
    public String getValue() {
        return m_total.toString();
    }

    // ================================================================= getValue

    /**
     * Set the total value.
     *
     * @param value New value that should be used for the calculator total.
     */
    public void setValue(String value) {
        m_total = new BigInteger(value);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (int i = 0; i < observersList.size(); i++) {
            Observer observer = (Observer) observersList.get(i);
            observer.update(this);
        }
    }

    @Override
    public void register(Observer obs) {
        // TODO Auto-generated method stub
        observersList.addElement(obs);
    }
}