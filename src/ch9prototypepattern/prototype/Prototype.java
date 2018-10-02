package ch9prototypepattern.prototype;


public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Prototype Clone();
}

class ConcretePrototype extends Prototype implements Cloneable {

    public ConcretePrototype(String id) {
        super(id);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Prototype Clone() {
        Object object = null;
        // TODO Auto-generated method stub
        try {
            object = super.clone();

        } catch (CloneNotSupportedException exception) {

            System.err.println("Not support cloneable");
        }
        return (Prototype) object;
    }

//>>>>>>> c8419c8a52c512e300f261ea04986559973a1601
}