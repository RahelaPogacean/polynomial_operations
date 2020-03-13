package model;

public class MyException extends Exception {

	private String s;
	
	public MyException(String s) {
		super(s);
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
}
