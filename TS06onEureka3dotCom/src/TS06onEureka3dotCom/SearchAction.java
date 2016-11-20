package TS06onEureka3dotCom;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute() {
		return "replay";
	}
	
	private ResultBean myBean;
	public void setResultBean(ResultBean value) {
		this.myBean = value;
	}
	public ResultBean getResultBean() {
		return this.myBean;
	}
	
}
