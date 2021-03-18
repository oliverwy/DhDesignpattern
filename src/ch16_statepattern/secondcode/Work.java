package ch16_statepattern.secondcode;

public class Work {
    private int hour;
    private boolean workFinished;

    public static void main(String[] args) {
        Work emergencyProject = new Work();
        emergencyProject.setHour(9);
        emergencyProject.writeProgram();
        emergencyProject.setHour(10);
        emergencyProject.writeProgram();
        emergencyProject.setHour(12);
        emergencyProject.writeProgram();
        emergencyProject.setHour(13);
        emergencyProject.writeProgram();
        emergencyProject.setHour(14);
        emergencyProject.writeProgram();
        emergencyProject.setHour(17);
        emergencyProject.setWorkFinished(false);
        emergencyProject.writeProgram();
        emergencyProject.setHour(19);
        emergencyProject.writeProgram();
        emergencyProject.setHour(20);
        emergencyProject.writeProgram();
        emergencyProject.setHour(21);
        emergencyProject.writeProgram();
        emergencyProject.setHour(22);
        emergencyProject.writeProgram();
        emergencyProject.setHour(23);
        emergencyProject.writeProgram();

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }

    public void writeProgram() {
        if (hour < 12)
            System.out.printf("\n当前时间:%s点，上午工作，精神百倍", hour);
        else if (hour < 13)
            System.out.printf("\n当前时间:%s点，饿了，午饭，犯困，午休", hour);
        else if (hour < 17)
            System.out.printf("\n当前时间:%s点，下午状态不错，继续努力", hour);
        else {
            if (workFinished)
                System.out.printf("\n当前时间:%s点，下班回家", hour);
            else {
                if (hour < 21) {
                    System.out.printf("\n当前时间:%s点，加班，疲劳至极", hour);
                } else {
                    System.out.printf("\n当前时间:%s点，不行了，睡着了", hour);
                }

            }
        }
    }
}
