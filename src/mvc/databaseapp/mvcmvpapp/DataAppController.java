package mvc.databaseapp.mvcmvpapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

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
			ArrayList<String> conditions = new ArrayList<String>();
			if (d_view.getIDSelected())
				conditions.add("(Sid = '" + d_view.getIDtext() + "')");
			if (d_view.getNameSelected())
				conditions.add("(Sname like '" + d_view.getNameText() + "')");
			if (d_view.getSexSelected())
				conditions.add("(Ssex = '" + d_view.getSexText() + "')");
			if (d_view.getAgeSelected())
				conditions.add("(Sage >= " + d_view.getAgeStartText() + " AND " + "Sage <= " + d_view.getAgeEndText() + ")");
			if (d_view.getClass_Selected())
				conditions.add("(Sclass = '" + d_view.getClass_Text() + "')");
			if (d_view.getDeptSelected())
				conditions.add("(Sdept = '" + d_view.getDeptText() + "')");
			if (d_view.getAddrSelected())
				conditions.add("(Saddr like '" + d_view.getAddrText()+ "')");

			String queryString = d_model.buildSQLQuery(conditions);
			d_view.setTextArea(queryString);
//
			d_view.dataModleClear();;
			try {
				d_view.dataModelAddManyRecord(d_model.getQueryResult(queryString));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			d_view.tableRepaint();
		}
	}

	class UpdateActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int row = d_view.getTableSelectedRow();
			int column = d_view.getTableSelectedColumn();
			if (row == -1 || column == 0)
				return;
//
			String val = d_view.getTableSelectedValue(row, column);
			String sid = d_view.getTableSID(row);
			String cmd = d_model.buildSQLUpdateStatement(column, val, sid);
			d_view.setTextArea(cmd);;
//
////			PreparedStatement ps;
			try {
				int rs = d_model.exeSQLStatement(cmd);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	class DeleteActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int row = d_view.getTableSelectedRow();
			String sid = d_view.getTableSID(row);
			String sql =d_model.buildSQLDeleteStatement(sid);
//
//			// 在文本框显示 SQL 命令
			d_view.setTextArea(sql);;
//
			try {
				int rs=d_model.exeSQLStatement(sql);
				d_view.removeDataModelRow(row);
//
//				// 更新表格
				d_view.tableRepaint();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}
	class InsertActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String sid = d_view.getIDtext();
			String sname = d_view.getNameText();
			String ssex = d_view.getSexText();
			String sage = d_view.getAgeStartText();
			String sclass = d_view.getClass_Text();
			String sdept = d_view.getDeptText();
			String saddr = d_view.getAddrText();
//			// 在文本框显示 SQL 命令
			String cmd =d_model.buildSQLInsertStatement(sid, sname, ssex, sage, sclass, sdept, saddr);
			d_view.setTextArea(cmd);;
//
//			PreparedStatement ps;
			try {
				int rs=d_model.exeSQLStatement(cmd);
				d_view.dataModelAddOneRecord(new Vector<String>(Arrays.asList(sid, sname, ssex, sage, sclass, sdept, saddr)));
//
//				// 更新表格
				d_view.tableRepaint();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

	}
}
