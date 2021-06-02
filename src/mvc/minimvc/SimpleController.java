package mvc.minimvc;

public class SimpleController {
	private SImpleModel model;
	private SimpleVIew vIew ;
	public SimpleController(SImpleModel model, SimpleVIew vIew) {
		super();
		this.model = model;
		this.vIew = vIew;
	}
	
	public void insertDataToDb()
	{
		model.insertDbData(vIew.sendData());
	}
	
	public void updateView() {
		vIew.displayMsg(model.getDataFromDB());
	}
}
