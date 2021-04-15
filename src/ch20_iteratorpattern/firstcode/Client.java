package ch20_iteratorpattern.firstcode;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcreteAggregate a = new ConcreteAggregate(); //则是5号车厢，上了以下这些乘客
        a.insert(0, "大鸟");  
        a.insert(1, "小菜");
        a.insert(2, "小李");
        a.insert(3, "老外");
        a.insert(4, "内部员工");
        a.insert(5, "公务人员");
        a.insert(6, "乘客A");
        a.insert(7, "乘客B");
        a.insert(8, "老人");
        Iterator i = new ConcreteIterator(a); //查票员来到了5号车厢，
        Object item = i.first();//从第一个开始查。
        while (!i.isDone()) {//走到车尾了没？
            System.out.printf("\n%s请出示车票", i.currentItem());
            i.next();
        }
    }
}
