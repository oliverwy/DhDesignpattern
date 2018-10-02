package ch19Compositepattern.CompositecompanyMis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ConcreteCompany extends Company {
	private List<Company> children =new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n"+String.join("",Collections.nCopies(depth,"-"))+getName());
		for(int i=0;i<children.size();i++)
		{
			children.get(i).display(depth+2);;
		}
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for(int i=0;i<children.size();i++)
		{
			children.get(i).lineOfDuty();
		}

	}
}


