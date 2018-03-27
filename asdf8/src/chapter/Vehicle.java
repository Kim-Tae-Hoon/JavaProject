package chapter;

public class Vehicle {
	private int speed;
	private boolean turn;
	private int gear;

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void Turn(boolean turn) {
		this.turn = turn;
	}

	void gearUp(int gear) {
		this.gear = gear + 1;
	}

	void gearDown(int gear) {
		this.gear = gear - 1;
	}
}