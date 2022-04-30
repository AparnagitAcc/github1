package org.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("Ktm cost : 2 lakh");
	}

	@Override
	public void speed() {
		System.out.println("Ktm Speed : 170km/hr");
	}
	
 public static void main(String[] args) {
	Ktm k = new Ktm ();
	k.cost();
	k.speed();
}
}
