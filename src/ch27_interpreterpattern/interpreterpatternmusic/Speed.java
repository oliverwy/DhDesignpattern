package ch27_interpreterpattern.interpreterpatternmusic;

public class Speed extends Expression {

    @Override
    public void excute(String key, double value) {
        // TODO Auto-generated method stub
        String Speed;
        if (value < 500)
            Speed = "快速";
        else if (value >= 1000)
            Speed = "慢速";
        else {
            Speed = "中速";
        }

        System.out.printf("%s ", Speed);
    }

}
