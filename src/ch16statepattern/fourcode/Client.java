package ch16statepattern.fourcode;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work emergencyProject=new Work();
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
		emergencyProject.setFinish(false);
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

}
