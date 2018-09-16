package ch8.factory;

public interface IFactory {
    Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        // TODO Auto-generated method stub
        return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        // TODO Auto-generated method stub
        return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        // TODO Auto-generated method stub
        return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        // TODO Auto-generated method stub
        return new OperationDiv();
    }

}