package mvc.calcapp.mvcobserverapp;

//视图
public class TotalResultView implements Observer {
	private CalcGUI c_gui;
	private CalcModel c_model;

	public TotalResultView(CalcGUI c_gui, CalcModel c_model) {
		super();
		this.c_gui = c_gui;
		this.c_model = c_model;
	}

	@Override
	public void update(Observable subject) {
		// TODO Auto-generated method stub
		if ((subject == c_model) & (c_model.isBtnMultiplyClicked())) {
			c_gui.setTotal(c_model.getValue());
		}
		if ((subject == c_model) & (c_model.isBtnClearClicked())) {
			c_gui.reset();
		}

	}

}
