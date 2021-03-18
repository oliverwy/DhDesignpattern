package ch23_commandpattern.loosecouplingafter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Waiter {
    private List<Command> orders = new ArrayList<Command>();

    public void setOrder(Command command) {
        String[] Strcom = command.toString().split("@");
        System.out.println(Strcom[0]);
        if (Strcom[0] == "ch23.commandpatternloosecouplingafter.BakeChickenWing") {
            System.out.println("服务员：没有烤鸡翅了，请点别的烧烤");
        } else {
            orders.add(command);
            Date date = new Date();
            System.out.println("增加订单：" + command.toString() + "  时间：" + date.toString());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        Date date = new Date();
        System.out.println("取消订单：" + command.toString() + "  时间：" + date.toString());
    }

    public void notifys() {
        for (Command cmd : orders) {
            cmd.excuteCommand();
        }
    }
}
