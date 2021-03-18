package ch09_prototypepattern.mydeepcloneprototype;

//我自己的实现方法，思路应该没问题，不知道会不是有其他错误。
public class WorkExperience implements Cloneable { //深度复制必须明确告诉子结构也要复制才行，要暴露其Clone接口
    private String wordate;
    private String company;

    //也就是要Override Object的的Clone函数，
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public String getWordate() {
        return wordate;
    }

    public void setWordate(String wordate) {
        this.wordate = wordate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        super();
        this.name = name;
        this.work = new WorkExperience();
    }

    public void setPersionInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExprience(String workdate, String company) {
        this.work.setWordate(workdate);
        this.work.setCompany(company);
        ;
    }

    public void display() {
        System.out.printf("\n %s %s %s", name, sex, age);
        System.out.printf("\n 工作经历：%s %s", work.getWordate(), work.getCompany());
    }

    public Object Clone() {
        Resume object = null;
        // TODO Auto-generated method stub
        try {
            object = (Resume) super.clone();
            object.work = (WorkExperience) work.clone();
        } catch (CloneNotSupportedException exception) {

            System.err.println("Not support cloneable");
        }
        return (Object) object;
    }
}