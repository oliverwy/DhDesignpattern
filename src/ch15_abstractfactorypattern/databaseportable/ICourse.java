package ch15_abstractfactorypattern.databaseportable;

public interface ICourse {
	public void insert(Course c);
	public Course getById(String ID);
}
