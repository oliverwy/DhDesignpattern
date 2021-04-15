package ch15_abstractfactorypattern.abstractfactorydatapool;

public abstract class Pool {
	public String propertiesName="connction-inf.properties";
	private static Pool instance=null;
	protected int maxCount=100;
	protected int normalCount=10;
	protected String driverName=null;
//	protected Dirver driver=null;
}
