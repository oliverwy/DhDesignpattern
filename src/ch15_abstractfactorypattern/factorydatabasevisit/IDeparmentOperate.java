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

class MySQLServerDFactory implements IDFactory {

	private Connection con;
	public MySQLServerDFactory() {
		super();
		connectToDb();
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到MySQL数据库");
	}
	@Override
	public IDeparmentOperate createDepatentEntity() {
		return new MySQLDepartmentEntity();
	}
}

class PostgreMySQLDFactory implements IDFactory {

	private Connection con;
	public PostgreMySQLDFactory() {
		super();
		connectToDb();
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到PostgreSQL数据库");
	}
	@Override
	public IDeparmentOperate createDepatentEntity() {
		return new PostgreSQLDepartmentEntity();
	}
}
public interface IDeparmentOperate {
	public void insert(Department department);
	public Department getDepartment(int id);
}
class MySQLDepartmentEntity implements IDeparmentOperate {
    @Override
    public void insert(Department deparment) {
        System.out.println("在MySQL中添加一条Deparment记录");
    }
    @Override
    public Department getDepartment(int id) {
        System.out.println("在MySQL中根据ID得到Deparment表的一条记录");
        return null;
    }
}

class PostgreSQLDepartmentEntity implements IDeparmentOperate {
    @Override
    public void insert(Department deparment) {
        System.out.println("在PostgreSQL中添加一条Deparment记录");
    }
    @Override
    public Department getDepartment(int id) {
        System.out.println("在AAcesss中根据ID得到Deparment表的一条记录");
        return null;
    }
}
