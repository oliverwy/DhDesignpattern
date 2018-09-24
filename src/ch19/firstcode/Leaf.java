package ch19.firstcode;

import java.util.Collections;

public class Leaf extends Component {
	

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("不能给叶子节点添加后代");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("不能从叶子节点删除后代");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n"+String.join("",Collections.nCopies(depth,"-"))+getName());
	}

}
