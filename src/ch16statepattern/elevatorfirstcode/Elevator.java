package ch16statepattern.elevatorfirstcode;


interface AbstractStateInteface {
    public void open(Elevator e);

    public void close(Elevator e);

    public void start(Elevator e);

    public void stop(Elevator e);

    public void upward(Elevator e);

    public void downward(Elevator e);
}

public class Elevator {
    public static final int STOPOPENED_STATE = 1; // 停止门打开状态
    public static final int STOPCLOSED_STATE = 2;// 停止门关闭状态
    public static final int LIFTOFF_STATE = 3; // 停止服务状态
    public static final int RUNING_STATE = 4;// 运行状态
    public static final int UPWARD = 11; // 向上上行
    public static final int DOWNWWARD = 12; // 下行
    private int direction;
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void open() {
        String string = "";
        switch (state) {
            case RUNING_STATE:
                string = "我正在运动状态，不能开门，请不要强行电梯门";
                break;
            case STOPCLOSED_STATE:
                string = "我现在即将开门，两秒后可以出入电梯了";
                this.state = STOPOPENED_STATE;
                break;
            case STOPOPENED_STATE:
                string = "电梯门已打开，不要重复发送Open指令";
                break;
            case LIFTOFF_STATE:
                string = "停用!";
                break;
        }
        System.out.println(string);
    }

    public void close() {
        String string = "";
        switch (state) {
            case RUNING_STATE:
                string = "我正在运动状态，门已关闭,不要重复发Close指令";
                break;
            case STOPCLOSED_STATE:
                string = "电梯门已关闭，可以响应其他指令，请不要重复发close指令";
                break;
            case STOPOPENED_STATE:
                string = "电梯门即将关闭，请注意安全";
                this.state = STOPCLOSED_STATE;
                break;
            case LIFTOFF_STATE:
                string = "停用!";
                break;
        }
        System.out.println(string);
    }

    public void start() {
        String string = "";
        switch (state) {
            case RUNING_STATE:
                if (direction == UPWARD) {
                    string = "正在上行状态，已经运行，不能再次发送start指令，请等待";
                } else {
                    string = "正在下行状态，已经运行，不能再次发送start指令，请等待";
                }
                break;
            case STOPCLOSED_STATE:
                if (direction == UPWARD) {
                    string = "电梯门已关闭，将开始继续上行";
                    this.state = RUNING_STATE;
                    this.direction = UPWARD;
                } else {
                    string = "电梯门已关闭，将开始继续下行！";
                    this.state = RUNING_STATE;
                    this.direction = DOWNWWARD;
                }
                break;
            case STOPOPENED_STATE:
                if (direction == UPWARD) {
                    string = "正在上行中，电梯门在打开状态，不能启动电梯 start指令";
                } else {
                    string = "正在下行中，电梯门在打开状态，不能启动电梯 start指令";
                }
                break;
            case LIFTOFF_STATE:
                string = "停用!";
                break;
        }
        System.out.println(string);
    }

    public void stop() {
        String string = "";
        switch (state) {
            case RUNING_STATE:
                if (direction == UPWARD) {
                    string = "正在上行中，准备停止，请稍等！";
                    this.state = STOPCLOSED_STATE;
                    this.direction = UPWARD;
                } else {
                    string = "正在下行中，准备停止，请稍等！";
                    this.state = STOPCLOSED_STATE;
                    this.direction = DOWNWWARD;
                }
                break;
            case STOPCLOSED_STATE:
                if (direction == UPWARD) {
                    string = "正在上行中，已到楼层停止，不能反复发送STOP指令";
                } else {
                    string = "正在下行中，已到楼层停止，不能反复发送STOP指令";
                }
                break;
            case STOPOPENED_STATE:
                if (direction == UPWARD) {
                    string = "正在上行中，电梯门已打开，不能反复发送STOP指令";
                } else {
                    string = "正在下行中，电梯门已打开，不能反复发送STOP指令";
                }
                break;
            case LIFTOFF_STATE:
                string = "停用!";
                break;
        }
        System.out.println(string);
    }

}

// 或者

abstract class AbstractState {
    abstract public void open(Elevator e);

    abstract public void close(Elevator e);

    abstract public void start(Elevator e);

    abstract public void stop(Elevator e);

    abstract public void upward(Elevator e);

    abstract public void downward(Elevator e);
}