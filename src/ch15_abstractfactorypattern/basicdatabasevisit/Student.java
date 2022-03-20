package ch15_abstractfactorypattern.basicdatabasevisit;

public class Student {
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", nameString=" + nameString + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ID != other.ID)
			return false;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		return true;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	private int ID;
	private String nameString;
	public Student(int iD, String nameString) {
		super();
		ID = iD;
		this.nameString = nameString;
	}
	

}
