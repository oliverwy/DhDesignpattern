package mvc.minimvcconsoledataapp;

public class mvcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSerivce serivce=new StudentSerivce();
		StudentView view=new StudentView();
		StuController stController=new StuController(serivce, view);
//		stController.createTable();
		stController.insertStudent();
		stController.updateView();
		stController.updateStudent();
		stController.updateView();
		stController.deleteStudent();
		stController.updateView();
	}

}
