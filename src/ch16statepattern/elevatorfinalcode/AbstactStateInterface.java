package ch16statepattern.elevatorfinalcode;

public interface AbstactStateInterface {
	public void open();

	public void close();

	public void start();

	public void stop();
}

class UpStopedOpenedState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "电梯门已打开，不要重复发送Open指令";
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "电梯门即将关闭，请注意安全";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "正在上行中，电梯门在打开状态，不能启动电梯 start指令";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在上行中，电梯门已打开，不能反复发送STOP指令";
		System.out.println(string);
	}
}

class DownStopedOpenedState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "电梯门已打开，不要重复发送Open指令";
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "电梯门即将关闭，请注意安全";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "正在下行中，电梯门在打开状态，不能启动电梯 start指令";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在下行中，电梯门已打开，不能反复发送STOP指令";
		System.out.println(string);
	}
}

class DownStopedClosedState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "我现在即将开门，两秒后可以出入电梯了";
		;
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "电梯门已关闭，可以响应其他指令，请不要重复发close指令";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "电梯门已关闭，将开始继续下行！";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在下行中，已到楼层停止，不能反复发送STOP指令";
		System.out.println(string);
	}
}

class UpStopedClosedState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "我现在即将开门，两秒后可以出入电梯了";
		;
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "电梯门已关闭，可以响应其他指令，请不要重复发close指令";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "电梯门已关闭，将开始继续上行！";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在上行中，已到楼层停止，不能反复发送STOP指令";
		System.out.println(string);
	}
}

class UpRunningState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "我正在上行运动状态，不能开门，请不要强行电梯门";
		;
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "我正在上行运动状态，门已关闭,不要重复发Close指令";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "正在上行状态，已经运行，不能再次发送start指令，请等待";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在上行中，不能响应STOP指令，请稍等！";
		System.out.println(string);
	}
}

class DownRunningState implements AbstactStateInterface {
	@Override
	public void open() {
		String string = "我正在下行运动状态，不能开门，请不要强行电梯门";
		;
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "我正在下行运动状态，门已关闭,不要重复发Close指令";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "正在下行状态，已经运行，不能再次发送start指令，请等待";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "正在下行中，不能响应STOP指令，请稍等！";
		System.out.println(string);
	}
}

class LiftOffState implements AbstactStateInterface {

	@Override
	public void open() {
		String string = "停用!";
		System.out.println(string);
	}

	@Override
	public void close() {
		String string = "停用!";
		System.out.println(string);
	}

	@Override
	public void start() {
		String string = "停用!";
		System.out.println(string);
	}

	@Override
	public void stop() {
		String string = "停用!";
		System.out.println(string);
	}

}