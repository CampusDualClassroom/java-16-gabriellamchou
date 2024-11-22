package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		plane.start();
		tractor.start();

		plane.takeOff();
		plane.fly();
		plane.land();
		tractor.forward();
		tractor.stop();

	}

}
