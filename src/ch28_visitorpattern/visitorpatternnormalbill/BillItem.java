package ch28_visitorpattern.visitorpatternnormalbill;

//单个账目元素的的接口（相当于Element） 每个元素都允许人查看，
//但是不同人查看的视角会不同
public interface BillItem {
    void visitedBy(AccountBookViewer viewer);
}
