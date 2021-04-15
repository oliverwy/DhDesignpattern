package ch15_abstractfactorypattern.databaseportable;

public interface IStudent {
	public void insert(Student s);
	public Student getById(String id);
}
