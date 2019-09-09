package mvc.databaseapp.mvcobserverapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class DisplaySQLStatementView  implements Observer {
	private DataAPPMainFrame d_view;
	private DataModel d_model;

	public DisplaySQLStatementView(DataAPPMainFrame c_gui, DataModel c_model) {
		super();
		this.d_view = c_gui;
		this.d_model = c_model;
	}

	@Override
	public void update(Observable subject) {
		// TODO Auto-generated method stub
		if ((subject==d_model)&&(d_model.isQueryBtuClicked()))
		{
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
			d_view.dataModleClear();
			try {
				d_view.dataModelAddManyRecord(d_model.getQueryResult(queryString));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			d_view.tableRepaint();
		}
		if ((subject==d_model)&&(d_model.isDeleteBtnClicked()))
		{
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
		if ((subject==d_model)&&(d_model.isInsertBtnClicked()))
		{
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
		if ((subject==d_model)&&(d_model.isUpdateBtnClicked()))
		{
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

}
