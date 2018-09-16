package ch7.proxynormal;

public interface Subject {
    public abstract void Requuest();
}

class RealSubjects implements Subject {

    @Override
    public void Requuest() {
        // TODO Auto-generated method stub
        System.out.println("真实的请求");
    }

}

class Proxy implements Subject {
    Subject reals = null;

    @Override
    public void Requuest() {
        // TODO Auto-generated method stub
        if (reals == null) {
            reals = new RealSubjects();
        }
        reals.Requuest();
    }

}