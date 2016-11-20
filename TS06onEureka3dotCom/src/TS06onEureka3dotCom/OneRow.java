package TS06onEureka3dotCom;

import java.io.Serializable;

public class OneRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pref_code = "";
	public void setPrefCode(String value) {
		this.pref_code = value;
	}
	public String getPrefCode() {
		return this.pref_code;
	}
	
	private String pref_name = "";
	public void setPrefName(String value) {
		this.pref_name = value;
	}
	public String getPrefName() {
		return this.pref_name;
	}
	
}
