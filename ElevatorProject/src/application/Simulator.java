package application;

import model.Elevator;
import model.Floor;
import model.Scheduler;

public class Simulator {

	// attributes
	private int timer;
	private Scheduler scheduler;
	private Elevator elevator;
	private Floor floor1;
	private Floor floor2;
	
	// constructor
	public Simulator(Scheduler scheduler, Elevator elevator,Floor floor1, Floor floor2) {
		this.timer = 0;
		this.scheduler = scheduler;
		this.elevator = elevator;
		this.floor1 = floor1;
		this.floor2 = floor2;
	}







	// main
	public static void main(String[] args) {
		

	}

}
