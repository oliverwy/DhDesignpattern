package ch16_statepattern.personactivefirstcode;


public class Person {
	public static  final int FURY_STATE=5; //暴怒状态
	public static final int ANGRY_STATE=4; //生气状态
	public static  final int CALM_STATE=6; // 平静状态
	public static  final int MOODILY_STATE=7; //情绪不稳定状态状态
	public static  final int MERRY_STATE=8;//高兴的状态
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public void hitByOther() {//被人人东西砸到
		String string = "";
		switch (state) {
		case MERRY_STATE:
			string="MERRY_STATE莫名的疑惑！平静的判断情况，咦，"
					+ "来了一只小恶魔，我看看他干啥！变成：CALM_STATE";
			this.state=CALM_STATE;
			break;
		case MOODILY_STATE:
			string = "MOODILY_STATE容易生气！，开始超生气状态转变，"
					+ "变成：ANGRY_STATE";
			this.state=ANGRY_STATE;
			break;
		case ANGRY_STATE:
			string="ANGRY_STATE开始还击，变成暴怒状态，变到：FURY_STATE";
			this.state=FURY_STATE;
			break;
		case FURY_STATE:
			string="ANGRY_STATE还击，并骂人，继续暴怒状态，"
					+ "状态不变：还是FURY_STATE";
			break;
		case CALM_STATE:
			string="CALM_STATE你为什么用东西打我！，开始情绪不稳定"
					+ "，转到情绪不稳定状态 转变到MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		}
		System.out.println(string);
	}
	public void reciveApologyMessage() {//收到道歉信息
		String string = "";
		switch (state) {
		case MERRY_STATE:
			string="MERRY_STATE没事，没事，保持状态不变，还是天使守规矩啊！"
					+ "状态不变：MERRY_STATE";
			break;
		case MOODILY_STATE:
			string = "MOODILY_STATE心情变好，开始平和！，原来是小天使啊碰到我了，"
					+ "没事，变成：CALM_STATE";
			this.state=CALM_STATE;
			break;
		case ANGRY_STATE:
			string="ANGRY_STATE缓和情绪，慢慢让自己的变得平静，呦，小天使啊，"
					+ "你这走路怎么象小恶魔，变成：MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		case FURY_STATE:
			string="FURY_STATE慢慢的缓和自己的情绪，居然是只小天使误碰了一下，"
					+ "这天使怎么都神经病了！！！变成：ANGRY_STATE";
			this.state=ANGRY_STATE;
			break;
		case CALM_STATE:
			string="CALM_STATE情绪会变好，原来是是个小天使啊，怎么穿着黑衣服，"
					+ "有点好玩，变成：MERRY_STATE";
			this.state=MERRY_STATE;
			break;
		}
		System.out.println(string);
	}
	public void slapByOther() {//被扇了一巴掌
		String string = "";
		switch (state) {
		case MERRY_STATE:
			string="MERRY_STATE为什么打我！！恶魔？天使？变成：MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		case MOODILY_STATE:
			string = "MOODILY_STATE开始猛烈还击！，怎么碰到这类鸟人，"
					+ "抽他，扁他，变成：FURY_STATE";
			this.state=FURY_STATE;
			break;
		case ANGRY_STATE:
			string="ANGRY_STATE变得暴怒！开始猛烈还击！，都是恶魔了，"
					+ "还不是好好滚蛋，我抽到你自动见你家大人去，变成：FURY_STATE";
			this.state=FURY_STATE;
			break;
		case FURY_STATE:
			string="FURY_STATE猛烈还击，地狱不够你消遣的吗，撒旦，"
					+ "我必须把你抽回去，状态不变：FURY_STATE";
			break;
		case CALM_STATE:
			string="CALM_STATE立马生气，开始还击，怎么碰到个小恶魔，"
					+ "开始抽他！变成：ANGRY_STATE";
			this.state=ANGRY_STATE;
			break;
		}
		System.out.println(string);
	}
	
	public void reciveDefyMessage() {//藐视，无视信息
		String string = "";
		switch (state) {
		case MERRY_STATE:
			string="MERRY_STATE为什么打我！！，你们什么时候出来的，"
					+ "撒旦你带着儿子人多就了不起啊 变成：MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		case MOODILY_STATE:
			string = "MOODILY_STATE开始猛烈还击！，恶魔。。撒旦怎么了，"
					+ "我照样能抽你 变成：ANGRY_STATE";
			this.state=ANGRY_STATE;
			break;
		case ANGRY_STATE:
			string="ANGRY_STATE变得暴怒！开始猛烈还击！，变成暴怒，"
					+ "变成：FURY_STATE";
			this.state=FURY_STATE;
			break;
		case FURY_STATE:
			string="FURY_STATE继续暴击。。。。！，继续暴怒，装填不变";
			break;
		case CALM_STATE:
			string="CALM_STATE你这个人神经病！，开始情绪不稳定。"
					+ "变成：MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		}
		System.out.println(string);
	}
	
	public void reciveHumorMessage() {
		String string = "";
		switch (state) {
		case MERRY_STATE:
			string="当前状态：MERRY_STATE,大王教你来巡山的，你就这样祸乱人间。。。"
					+ "哈哈，变成：MERRY_STATE";
			break;
		case MOODILY_STATE:
			string = "当前状态：MOODILY_STATE 这是哪个大王请来逗比表演的！！！"
					+ "不和你一般见识：变成：CALM_STATE";
			this.state=CALM_STATE;
			break;
		case ANGRY_STATE:
			string="ANGRY_STATE你就神经病！。。。。情绪慢慢消减！"
					+ "慢慢变得情绪不稳定，变成：MOODILY_STATE";
			this.state=MOODILY_STATE;
			break;
		case FURY_STATE:
			string="FURY_STATE慢慢从暴怒中恢复！。。。。，从愤怒中恢复，"
					+ "变成：ANGRY_STATE";
			this.state=ANGRY_STATE;
			break;
		case CALM_STATE:
			string="CALM_STATE你这么逗！！！变得高兴，"
					+ "变成：MERRY_STATE";
			this.state=MERRY_STATE;
			break;
		}
		System.out.println(string);
	}
}
