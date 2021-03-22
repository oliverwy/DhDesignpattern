package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;


public interface IFactory {
	public void connectToDb();
	public IUserOperate createUserEntity();
	public IDepatmentOperate createDepatentEntity();
}
