package mvc.databaseapp.mvcobserverapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataAppController {
    private DataModel d_model;
    private DataAPPMainFrame d_view;

    public DataAppController(DataModel d_model, DataAPPMainFrame d_view) {
        super();
        this.d_model = d_model;
        this.d_view = d_view;
        d_view.addInsertListener(new InsertActionListener());
        d_view.adddeleteListener(new DeleteActionListener());
        d_view.addQueryListener(new QueryActionListener());
        d_view.addUpdateListener(new UpdateActionListener());
    }

    class QueryActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d_model.setQueryBtuClicked(true);
            d_model.notifyObservers();
            d_model.setQueryBtuClicked(false);
        }
    }

    class UpdateActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d_model.setUpdateBtnClicked(true);
            d_model.notifyObservers();
            d_model.setUpdateBtnClicked(false);
        }
    }

    class DeleteActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            d_model.setDeleteBtnClicked(true);
            d_model.notifyObservers();
            d_model.setDeleteBtnClicked(false);
        }

    }

    class InsertActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            d_model.setInsertBtnClicked(true);
            d_model.notifyObservers();
            d_model.setInsertBtnClicked(false);
        }

    }
}
