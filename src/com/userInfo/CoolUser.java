package com.userInfo;

public class CoolUser implements Comparable<CoolUser>{
	
	private String firstName;
	private String lastName;
	private int selectionTotal;
	

	@Override
	public int compareTo(CoolUser o) {
		 int compareSelectionTotals =
				o.getSelectionTotal();
		 
		return this.selectionTotal = compareSelectionTotals;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSelectionTotal() {
		return selectionTotal;
	}


	public void setSelectionTotal(int selectionTotal) {
		this.selectionTotal = selectionTotal;
	}

}
