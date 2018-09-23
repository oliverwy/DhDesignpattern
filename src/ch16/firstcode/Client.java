package ch16.firstcode;

public class Client {
	static int hour=0;
	static boolean workFinished=false;
	public static void writeProgram()
	{
		if(hour<12)
			System.out.printf("\n当前时间:%s点，上午工作，精神百倍",hour);
		else if(hour<13)
			System.out.printf("\n当前时间:%s点，饿了，午饭，犯困，午休",hour);
		else if (hour<17)
			System.out.printf("\n当前时间:%s点，下午状态不错，继续努力",hour);
		else
		{
			if (workFinished)
				System.out.printf("\n当前时间:%s点，下班回家",hour);
			else
			{
				if (hour<21)
				{
					System.out.printf("\n当前时间:%s点，加班，疲劳至极",hour);
				}
				else
				{
					System.out.printf("\n当前时间:%s点，不行了，睡着了",hour);
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hour=9;
		writeProgram();
		hour=10;
		writeProgram();
		hour=12;
		writeProgram();
		hour=13;
		writeProgram();
		hour=14;
		writeProgram();
		hour=17;
		workFinished=true;
		writeProgram();
		hour=19;
		writeProgram();
		hour=21;
		writeProgram();
		hour=22;
		writeProgram();
		hour=23;
		writeProgram();
		
	}

}
