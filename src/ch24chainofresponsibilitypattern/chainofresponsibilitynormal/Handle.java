package ch24chainofresponsibilitypattern.chainofresponsibilitynormal;

public abstract class Handle {
    protected Handle successor;

    public Handle getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

class ConcreteHandler1 extends Handle {

    @Override
    public void handleRequest(int request) {
        // TODO Auto-generated method stub
        if (request >= 0 && request < 10) {
            System.out.printf("\n%s处理请求%s", this.getClass().getName(), request);

        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}

class ConcreteHandler2 extends Handle {

    @Override
    public void handleRequest(int request) {
        // TODO Auto-generated method stub
        if (request >= 10 && request < 20) {
            System.out.printf("\n%s处理请求%s", this.getClass().getName(), request);

        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}

class ConcreteHandler3 extends Handle {

    @Override
    public void handleRequest(int request) {
        // TODO Auto-generated method stub
        if (request >= 20 && request < 30) {
            System.out.printf("\n%s处理请求%s", this.getClass().getName(), request);

        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }

}