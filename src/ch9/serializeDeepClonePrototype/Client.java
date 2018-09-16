package ch9.serializeDeepClonePrototype;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Resume a=new Resume("大鸟");
		a.setPersionInfo("男", "29");
		a.setWorkExprience("1998-2000", "XXXX公司");
		
		Resume b =(Resume) a.deepClone();
		b.setWorkExprience("1998-2006", "YY企业");
		
		Resume c=(Resume) a.deepClone();
		c.setPersionInfo("女", "22");
		c.setWorkExprience("1998-2003", "ZZ企业");
		
		a.display();
		b.display();
		c.display();

	}

}
/*运行结果，闹心了，本质原因浅度复制仅仅能复制简单的数据结构，复杂数据结构仅仅复制的是引用，也就是说
 * 三个Clone 都是指向一个WorkExperience
 * 浅复制的意思就是说呗复制的对象的所有变量都含有与原来的对象相同的值，
 * 而所有的对其他对象的引用，仍指向原来的对象，这就是为什么我们运行结果是这个的主要原因
 * 
 大鸟 男 29
 工作经历：1998-2003 ZZ企业
 大鸟 男 29
 工作经历：1998-2003 ZZ企业
 大鸟 女 22
 工作经历：1998-2003 ZZ企业
 */
