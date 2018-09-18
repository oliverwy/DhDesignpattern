package ch15.abstractfactorydatabasevisit;


interface IDepatment
{
	public void insert(Department department);
	public Department getDepartment(int id);
}

public class Department {
	private int ID;
	private String DeptName;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
}



class SqlserverDepartment implements IDepatment
{

	@Override
	public void insert(Department deparment) {
		// TODO Auto-generated method stub
		System.out.println("在SQLserver中添加一条Deparment记录");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQLserver中根据ID得到Deparment表的一条记录");
		return null;
	}
}

class AccessDepartment implements IDepatment
{

	@Override
	public void insert(Department deparment) {
		// TODO Auto-generated method stub
		System.out.println("在Access中添加一条Deparment记录");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在AAcesss中根据ID得到Deparment表的一条记录");
		return null;
	}
}

