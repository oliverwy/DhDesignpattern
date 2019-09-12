package ch19Compositepattern.CompositecompanyMis;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海惠东分公司");
        comp.add(new HrDepartment("惠东分公司人力资源部"));
        comp.add(new FinanceDepartment("惠东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HrDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HrDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp.add(comp2);

        System.out.println("\n结构图");
        root.display(1);

        System.out.println("\n职责");
        root.lineOfDuty();
    }

}
