package kr.ac.daelim.uml.zoo;

public class Pigeon extends Animal{

	public Pigeon() {
		cry = new BirdCry();
		fly = new FlyWithWings();
		
	}
	@Override
	public void display() {
		System.out.println("비둘기");		
	}
	public void performcry() {
		cry.cry();
	}
	public void performFly() {
		fly.fly();
	}

}
