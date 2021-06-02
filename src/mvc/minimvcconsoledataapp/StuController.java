package mvc.minimvcconsoledataapp;

public class StuController {
	private StudentSerivce serivce;
	private StudentView view;
	public StuController(StudentSerivce serivce, StudentView view) {
		super();
		this.serivce = serivce;
		this.view = view;
	}
	public void updateView() {
		view.displayAllDetail(serivce.getAllStudentInfo());
	}
	
	public void createTable() {
		serivce.createTable();
	}
	
	public void deleteStudent() {
		serivce.deleteFromStudent(view.getDeleteStudentInfo());
	}
	
	public void insertStudent() {
		serivce.insertStudent(view.getNewStudent());
		
	}
	
	public void updateStudent()
	{
		serivce.updateStudentInfo(view.getUpdateStudentInfo());
	}
}
