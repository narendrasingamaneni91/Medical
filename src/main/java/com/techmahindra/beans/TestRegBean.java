package com.techmahindra.beans;

public class TestRegBean implements java.io.Serializable
{
	private int test_id;
	private String test_name;
	private String test_type;
	private String reg_date;
	private String test_date;
	//private int test_hr;
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	//private int test_min;
	private int amount;
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public String getTest_name() {
		return test_name;
	}
	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}
	public String getTest_type() {
		return test_type;
	}
	public void setTest_type(String test_type) {
		this.test_type = test_type;
	}
	public String getTest_date() {
		return test_date;
	}
	public void setTest_date(String test_date) {
		this.test_date = test_date;
	}
	/*public int getTest_hr() {
		return test_hr;
	}
	public void setTest_hr(int test_hr) {
		this.test_hr = test_hr;
	}
	public int getTest_min() {
		return test_min;
	}
	public void setTest_min(int test_min) {
		this.test_min = test_min;
	}*/
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
