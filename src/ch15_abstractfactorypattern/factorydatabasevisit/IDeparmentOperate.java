package ch15_abstractfactorypattern.factorydatabasevisit;

import java.sql.Connection;

class Department {
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

interface IDFactory {
	public void connectToDb();
	public IDeparmentOperate createDepatentEntity();
}

class SqlserverDFactory implements IDFactory {

	private Connection con;
	public SqlserverDFactory() {
		super();
		connectToDb();
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到SQLserver数据库");
	}
	@Override
	public IDeparmentOperate createDepatentEntity() {
		return new SqlserverDepartmentEntity();
	}
}

class AccessDFactory implements IDFactory {

	private Connection con;
	public AccessDFactory() {
		super();
		connectToDb();
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到Access数据库");
	}
	@Override
	public IDeparmentOperate createDepatentEntity() {
		return new AccessDepartmentEntity();
	}
}
public interface IDeparmentOperate {
	public void insert(Department department);
	public Department getDepartment(int id);
}
class SqlserverDepartmentEntity implements IDeparmentOperate {
    @Override
    public void insert(Department deparment) {
        System.out.println("在SQLserver中添加一条Deparment记录");
    }
    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQLserver中根据ID得到Deparment表的一条记录");
        return null;
    }
}

class AccessDepartmentEntity implements IDeparmentOperate {
    @Override
    public void insert(Department deparment) {
        System.out.println("在Access中添加一条Deparment记录");
    }
    @Override
    public Department getDepartment(int id) {
        System.out.println("在AAcesss中根据ID得到Deparment表的一条记录");
        return null;
    }
}
