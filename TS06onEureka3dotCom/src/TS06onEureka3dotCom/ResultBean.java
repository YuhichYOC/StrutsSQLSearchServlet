package TS06onEureka3dotCom;

import java.io.Serializable;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class ResultBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<OneRow> myTable = null;
	public ArrayList<OneRow> getTable() {
		return this.myTable;
	}
	
	private String searchFrom = "";
	public void setSearchFrom(String value) throws Exception {
		this.searchFrom = value;
		if (this.searchTo.equals("")) {
			// 何もしない
		} else {
			// 検索実行
			search();
		}
	}
	public String getSearchFrom() {
		return this.searchFrom;
	}
	
	private String searchTo = "";
	public void setSearchTo(String value) throws Exception {
		this.searchTo = value;
		if (this.searchFrom.equals("")) {
			// 何もしない
		} else {
			// 検索実行
			search();
		}
	}
	public String getSearchTo() {
		return this.searchTo;
	}
	
	private HashMap<String, ArrayList<OneRow>> mySession;
	public HashMap<String, ArrayList<OneRow>> getSession() {
		return mySession;
	}
	
	private MySQLAccessor myAccessor = null;
	private void search() throws Exception {
		
		try {
			
			myAccessor = new MySQLAccessor();
			myAccessor.setDataSource("test");
			myAccessor.setUserId("test");
			myAccessor.setPassword("password");
			
			myAccessor.createConnectionString();
			myAccessor.createConnection();
			
			ResultSet rs = myAccessor.executeSelectTest04(this.searchFrom, this.searchTo);
			
			if (rs == null) {
				return;
			} else {
				this.myTable = new ArrayList<OneRow>();
				this.mySession = new HashMap<String, ArrayList<OneRow>>();
				while (rs.next()) {
					OneRow currentRow = new OneRow();
					currentRow.setPrefCode(rs.getString("PREF_CODE"));
					currentRow.setPrefName(rs.getString("PREF_NAME"));
					this.myTable.add(currentRow);
				}
				mySession.put("dataTable", this.myTable);
			}
			
		} catch (Exception e) {
			
			throw new Exception(e);
			
		}
		
	}
	
}
