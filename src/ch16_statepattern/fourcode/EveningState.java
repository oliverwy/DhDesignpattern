package ch16_statepattern.fourcode;

public class EveningState extends State {

    @Override
    public void writeProgram(Work w) {
        // TODO Auto-generated method stub
        if (w.isFinish()) {
            w.setCurrent(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.out.printf("\n当前时间:%s点，加班疲劳至极", w.getHour());
            } else {
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }

        }
    }


}
