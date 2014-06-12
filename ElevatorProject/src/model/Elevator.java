package model;

public class Elevator {

	// attributes
	private int position;
	private boolean button;
	private int destination;
	private boolean bell;
	private boolean ismoving;
	private boolean isempty;
	
	// constructor
	public Elevator(int position, boolean button, int destination,
			boolean bell, boolean ismoving, boolean isempty) {
		this.position = position;
		this.button = button;
		this.destination = destination;
		this.bell = bell;
		this.ismoving = ismoving;
		this.isempty = isempty;
	}
	

	//Get & Set
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public boolean isButton() {
		return button;
	}
	public void setButton(boolean button) {
		this.button = button;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public boolean isBell() {
		return bell;
	}
	public void setBell(boolean bell) {
		this.bell = bell;
	}
	public boolean isIsmoving() {
		return ismoving;
	}
	public void setIsmoving(boolean ismoving) {
		this.ismoving = ismoving;
	}
	public boolean isIsempty() {
		return isempty;
	}
	public void setIsempty(boolean isempty) {
		this.isempty = isempty;
	}
	
}

