package ch6.decoratorex;

public interface Component {
    public abstract void Operation();
}

class ConcreteComponent implements Component {

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        System.out.println("具体对象的操作");
    }

}

abstract class Decorator implements Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        if (component != null) {
            component.Operation();
        }
    }
}

class ConcreteDecoratorA extends Decorator {
    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        super.Operation();
        System.out.println("具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior() {

    }
}