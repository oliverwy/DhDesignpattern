package ch27interpreterpattern.interpreterpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		List<AbstractExpression> list=new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression item:list)
		{
			item.interpret(context);
		}
	}

}
