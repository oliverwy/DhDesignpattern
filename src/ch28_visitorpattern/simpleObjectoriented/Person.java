/**
 *
 */
package ch28_visitorpattern.simpleObjectoriented;

/**
 * @author oliver
 *
 */
public abstract class Person {
    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void getConclusion();
}

class Man extends Person {

    @Override
    public void getConclusion() {
        // TODO Auto-generated method stub
        if (action == "成功") {
            System.out.printf("\n%s %s时，多半有个伟大的女人", this.getClass().getName(), action);
        } else if (action == "失败") {
            System.out.printf("\n%s %s时，闷头喝酒，谁也不用劝", this.getClass().getName(), action);
        } else if (action == "恋爱") {
            System.out.printf("\n%s %s时，凡事不懂也要装懂", this.getClass().getName(), action);
        }
    }

}

class Woman extends Person {

    @Override
    public void getConclusion() {
        // TODO Auto-generated method stub
        if (action == "成功") {
            System.out.printf("\n%s %s时，背后多半有个不成功的男人", this.getClass().getName(), action);
        } else if (action == "失败") {
            System.out.printf("\n%s %s时，眼泪汪汪，谁也劝不了", this.getClass().getName(), action);
        } else if (action == "恋爱") {
            System.out.printf("\n%s %s时，遇事懂也装做不懂", this.getClass().getName(), action);
        }
    }

}