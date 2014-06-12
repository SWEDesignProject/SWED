package model;

public class Floor {

	// attributes
	private int floorId;
	private boolean floorLight; 
	private boolean floorButton;
	
	// constuctor
	public Floor(int floorId) {
		this.floorId = floorId;
		this.floorLight = false;
		this.floorButton = false;
	}

	// methods
	public void summonElevator(int destinationFloor){
		
	}
	
	
	// getter / setter
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public boolean isFloorLight() {
		return floorLight;
	}
	public void setFloorLight(boolean floorLight) {
		this.floorLight = floorLight;
	}
	public boolean isFloorButton() {
		return floorButton;
	}
	public void setFloorButton(boolean floorButton) {
		this.floorButton = floorButton;
	}
	
	
}
