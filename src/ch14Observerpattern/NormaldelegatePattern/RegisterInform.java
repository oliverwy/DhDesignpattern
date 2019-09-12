package ch14Observerpattern.NormaldelegatePattern;

public interface RegisterInform {
    public abstract void registerInform(Notifier object, String methodName, Object[] args);

    public abstract void unRegisterInform(Notifier object, String methodName, Object[] args);

}
