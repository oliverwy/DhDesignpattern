package mvc.calcapp.mvcapp;

public class CalcMVC {
    // ... Create model, view, and controller. They are
    // created once here and passed to the parts that
    // need them so there is only one copy of each.
    public static void main(String[] args) {

        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        CalcController controller = new CalcController(model, view);

        view.setVisible(true);
    }
}