package ch17.basketballadapter;

public class ForeignCenter {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void 进攻()
	{
		System.out.printf("\n外籍中锋%s进攻", getName());
	}
	
	public void 防守()
	{
		System.out.printf("\n外籍中锋%s防守", getName());
	}
}
class Translator extends Player
{
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		wjzf.进攻();
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		wjzf.防守();
	}

	private ForeignCenter wjzf=new ForeignCenter();

	public Translator(String name) {
		super(name);
		wjzf.setName(name);
		// TODO Auto-generated constructor stub
	}
	
}
