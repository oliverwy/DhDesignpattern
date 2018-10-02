package ch14Observerpattern.NormaldelegatePattern;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Event { //使用反射机制从执行队对象的方法
	private Object object; //委托对象
	private String methodName; //如果有需要通知我的信息，怎么通知我，
	private Object[] params; //方法参数相应的类型
	private Class[] paramTypes;//通知方法的参数，即你要通知我，我的哪个方法需要的参数是什么
	
	public Object[] getParams() {
		return params;
	}
	public void setParams(Object[] params) {
		this.params = params;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Event() {
		super();
	}
	public Event(Object object, String methodName, Object[] params) {
		super();
		this.object = object;
		this.methodName = methodName;
		this.params = params;
		if(null!=params)
			contractParamTypes(this.params); //  解析参数，并对应传进来
	}
	private void contractParamTypes(Object[] params)//根据参数的确定其类型，
	{
		this.paramTypes=new Class[params.length];
		for(int i=0;i<params.length;i++)
		{
			this.paramTypes[i]=params[i].getClass();
		}
	}
	public Class[] getParamTypes() {
		return paramTypes;
	}
	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public void invoke() throws Exception{
		Method method=object.getClass().getMethod(this.getMethodName(),
				this.getParamTypes()); //获取指定对象的方法。
		if (null==method)
			return;
		method.invoke(this.getObject(), this.getParams()); //å执行方法
	}
}



