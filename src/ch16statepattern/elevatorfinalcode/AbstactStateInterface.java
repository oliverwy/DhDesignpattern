package ch16statepattern.elevatorfinalcode;

public interface AbstactStateInterface {
    public void open(Elevator e);

    public void close(Elevator e);

    public void start(Elevator e);

    public void stop(Elevator e);

    public void upward(Elevator e);

    public void downward(Elevator e);
}

class UpStopedOpenedState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "电梯门已打开，不要重复发送Open指令";
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "电梯门即将关闭，请注意安全";
        e.setState(new UpStopedClosedState());
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "正在上行中，电梯门在打开状态，不能启动电梯 start指令";
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在上行中，电梯门已打开，不能反复发送STOP指令";
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
        System.out.println("开门状态，不能处理上行指令");
    }

    @Override
    public void downward(Elevator e) {
        System.out.println("开门状态，不能处理下行指令");
    }
}

class DownStopedOpenedState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "电梯门已打开，不要重复发送Open指令";
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "电梯门即将关闭，请注意安全";
        e.setState(new DownStopedClosedState());
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "正在下行中，电梯门在打开状态，不能启动电梯 start指令";
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在下行中，电梯门已打开，不能反复发送STOP指令";
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class DownStopedClosedState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "我现在即将开门，两秒后可以出入电梯了";
        e.setState(new DownStopedOpenedState());
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "电梯门已关闭，可以响应其他指令，请不要重复发close指令";
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "电梯门已关闭，将开始继续下行！";
        e.setState(new DownRunningState());
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在下行中，已到楼层停止，不能反复发送STOP指令";
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class UpStopedClosedState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "我现在即将开门，两秒后可以出入电梯了";
        e.setState(new UpStopedOpenedState());
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "电梯门已关闭，可以响应其他指令，请不要重复发close指令";
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "电梯门已关闭，将开始继续上行！";
        e.setState(new UpRunningState());
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在上行中，已到楼层停止，不能反复发送STOP指令";
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class UpRunningState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "我正在上行运动状态，不能开门，请不要强行电梯门";
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "我正在上行运动状态，门已关闭,不要重复发Close指令";
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "正在上行状态，已经运行，不能再次发送start指令，请等待";
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在上行停止中，请稍等！";
        e.setState(new UpStopedClosedState());
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class DownRunningState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "我正在下行运动状态，不能开门，请不要强行电梯门";
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "我正在下行运动状态，门已关闭,不要重复发Close指令";
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "正在下行状态，已经运行，不能再次发送start指令，请等待";
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "正在下行停止中，请稍等！";
        e.setState(new DownStopedClosedState());
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class LiftOffState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        String string = "停用!";
        System.out.println(string);
    }

    @Override
    public void close(Elevator e) {
        String string = "停用!";
        System.out.println(string);
    }

    @Override
    public void start(Elevator e) {
        String string = "停用!";
        System.out.println(string);
    }

    @Override
    public void stop(Elevator e) {
        String string = "停用!";
        System.out.println(string);
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}

class IdleStopState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {
        e.setState(new IdleOpenState());
    }

    @Override
    public void close(Elevator e) {
        System.out.println("在停止关闭状态");
    }

    @Override
    public void start(Elevator e) {
    }

    @Override
    public void stop(Elevator e) {
    }

    @Override
    public void upward(Elevator e) {
        e.setState(new UpRunningState());
    }

    @Override
    public void downward(Elevator e) {
        e.setState(new DownRunningState());
    }

}

class IdleOpenState implements AbstactStateInterface {
    @Override
    public void open(Elevator e) {

    }

    @Override
    public void close(Elevator e) {
        e.setState(new IdleStopState());
    }

    @Override
    public void start(Elevator e) {
    }

    @Override
    public void stop(Elevator e) {
    }

    @Override
    public void upward(Elevator e) {
    }

    @Override
    public void downward(Elevator e) {
    }
}
