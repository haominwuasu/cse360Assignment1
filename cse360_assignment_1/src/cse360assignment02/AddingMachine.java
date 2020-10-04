package cse360assignment02;

/*
 * 
 * @author Haomin Wu
 * @version 2.0
 * @since 2020-10-03
 *
 */

public class AddingMachine {
	private int total;
	private String record;  
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		this.record = "0";
	}
	  
	public int getTotal () {
		return total;
	}
	  
	public void add (int value) {
		this.record = this.record + " + ";
		this.record = this.record + String.valueOf(value);
		this.total = this.total + value;
	}

	public void subtract (int value) {
		this.record = this.record + " - ";
		this.record = this.record + String.valueOf(value);
		this.total = this.total - value;
	}

	public String toString () {
		return this.record;
	}

	public void clear() {
	}
}