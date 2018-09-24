package ch19.companyMis;

import java.util.Collections;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n"+String.join("",Collections.nCopies(depth,"-"))+getName());
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.printf("\n%s负责财务收支管理",getName());
	}

}
