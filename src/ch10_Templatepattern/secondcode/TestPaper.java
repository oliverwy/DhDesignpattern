package ch10_Templatepattern.secondcode;

public class TestPaper {
    public void testQuestion1() {
        System.out.println("杨过得到，后来给了郭靖，练成倚天剑，屠龙刀的玄铁可能是【】 A 球墨铸铁 B 马口铁 C 高速合金钢 D碳素纤维");
    }

    public void testQuestion2() {
        System.out.println("杨过、程英、陆无双铲除了情花，造成【】 A 是这种植物不在害人"
                + " B 使一种珍稀物种灭绝 C 破坏了那个生物圈的生态平衡 D 造成了该地区的沙漠化");
    }

    public void testQuestion3() {
        System.out.println("杨过得到，后来给了郭靖，练成倚天剑，倚天剑的玄铁可能是【】 A 球墨铸铁 B 马口铁 C 高速合金钢 D碳素纤维");
    }

}

class TestPaperA extends TestPaper {

    @Override
    public void testQuestion1() {
        // TODO Auto-generated method stub
        super.testQuestion1();
        System.out.println("答案 A");
    }

    @Override
    public void testQuestion2() {
        // TODO Auto-generated method stub
        super.testQuestion2();
        System.out.println("答案 B");
    }

    @Override
    public void testQuestion3() {
        // TODO Auto-generated method stub
        super.testQuestion3();
        System.out.println("答案 C");
    }
}

class TestPaperB extends TestPaper {

    @Override
    public void testQuestion1() {
        // TODO Auto-generated method stub
        super.testQuestion1();
        System.out.println("答案 C");
    }

    @Override
    public void testQuestion2() {
        // TODO Auto-generated method stub
        super.testQuestion2();
        System.out.println("答案 D");
    }

    @Override
    public void testQuestion3() {
        // TODO Auto-generated method stub
        super.testQuestion3();
        System.out.println("答案 A");
    }

}