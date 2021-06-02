package mvc.minimvc;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SImpleModel model=new SImpleModel();
		SimpleVIew vIew=new SimpleVIew();
		SimpleController controller=new SimpleController(model, vIew);
		controller.insertDataToDb();
		controller.updateView();
	}

}
