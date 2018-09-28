package ch19.Compositefirstcode;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> children =new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}
	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}
	@Override
	public void display(int depth) {
		System.out.println("-"+depth+getName());
		for(int i=0;i<children.size();i++)
		{
			children.get(i).display(depth+2);;
		}
	}
}
