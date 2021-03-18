package ch24_chainofresponsibilitypattern.chainofresponsibilitythirdcode;


public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplications(Request reguest);
}

class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void requestApplications(Request reguest) {
        // TODO Auto-generated method stub
        if (reguest.getRequestType() == "请假" && reguest.getNumber() <= 2) {
            System.out.printf("\n%s:%s数量%s天 被批准", name, reguest.getRequestContent(), reguest.getNumber());

        } else {
            if (superior != null) {
                superior.requestApplications(reguest);
            }
        }

    }

}

class MajorDemo extends Manager {

    public MajorDemo(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void requestApplications(Request reguest) {
        // TODO Auto-generated method stub
        if (reguest.getRequestType() == "请假" && reguest.getNumber() <= 5) {
            System.out.printf("\n%s:%s数量%s天 被批准", name, reguest.getRequestContent(), reguest.getNumber());

        } else {
            if (superior != null) {
                superior.requestApplications(reguest);
            }
        }

    }

}

class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void requestApplications(Request request) {
        // TODO Auto-generated method stub
        if (request.getRequestType() == "请假") {
            System.out.printf("\n%s:%s数量%s天 被批准", name, request.getRequestContent(), request.getNumber());

        } else if (request.getRequestType() == "加薪" && request.getNumber() <= 500) {
            System.out.printf("\n%s:%s数量%s 被批准", name, request.getRequestContent(), request.getNumber());
        } else if (request.getRequestType() == "加薪" && request.getNumber() > 500) {
            System.out.printf("\n%s:%s数量%s 在说吧", name, request.getRequestContent(), request.getNumber());

        }

    }

}

