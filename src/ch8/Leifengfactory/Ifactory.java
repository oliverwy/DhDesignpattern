package ch8.Leifengfactory;

public interface Ifactory {
	public abstract LeiFeng CreateLeifeng();
}

class UnderGraduateFactory implements Ifactory
{

	@Override
	public LeiFeng CreateLeifeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
	
}

class VolunterFactory implements Ifactory
{

	@Override
	public LeiFeng CreateLeifeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}
	
}