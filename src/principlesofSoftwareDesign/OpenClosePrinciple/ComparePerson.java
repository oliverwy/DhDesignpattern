package principlesofSoftwareDesign.OpenClosePrinciple;

public class ComparePerson extends CompareObject {

	@Override
	public Object getMax() {
		Person person1 = (Person) object1;
		Person person2 = (Person) object2;
		if (person1.getAge() > person2.getAge()) {
			return person1;
		}
		return person2;
	}

	@Override
	public Object getMin() {
		if (((Person) object1).getAge() > ((Person) object2).getAge()) {
			return (Person) object2;
		}
		return (Person) object1;
	}

	@Override
	protected boolean isAccept(Object arg1, Object arg2) {
		if ((arg1 instanceof Person) && (arg2 instanceof Person)) {
			return true;
		}
		return false;
	}
}
