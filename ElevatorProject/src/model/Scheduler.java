package model;

public class Scheduler {

	// attributes
	private int personTime1;
	private int personTime2;
	
	// constructor
	public Scheduler(int personTime1, int personTime2) {
		this.personTime1 = personTime1;
		this.personTime2 = personTime2;
	}

	// methods
	public void checkTime(){
		
	}
	
	// getter / setter
	public int getPersonTime1() {
		return personTime1;
	}
	public void setPersonTime1(int personTime1) {
		this.personTime1 = personTime1;
	}
	public int getPersonTime2() {
		return personTime2;
	}
	public void setPersonTime2(int personTime2) {
		this.personTime2 = personTime2;
	}
	
}
