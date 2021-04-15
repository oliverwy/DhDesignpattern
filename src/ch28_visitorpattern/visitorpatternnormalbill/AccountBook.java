package ch28_visitorpattern.visitorpatternnormalbill;

import java.util.ArrayList;
import java.util.List;

//账本类（相当于ObjectStruture）
public class AccountBook {
    // 账目列表
    private List<BillItem> billList = new ArrayList<BillItem>();

    // 添加收支项
    public void addBill(BillItem bill) {
        billList.add(bill);
    }

    // 供账本的查看者查看账本
    public void show(AccountBookViewer viewer) {
        for (BillItem bill : billList) {
            bill.visitedBy(viewer);
        }
    }
}