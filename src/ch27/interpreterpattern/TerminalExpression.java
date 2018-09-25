package ch27.interpreterpattern;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("终端解释器！");
	}

}

class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("非终端解释器！");
	}

}