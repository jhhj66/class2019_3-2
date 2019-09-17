package kr.ac.daelim.uml.zoo;

public class Eagle extends Animal{

	public Eagle() {
		cry = new BirdCry();
		fly = new FlyWithWings();
		
	}
	@Override
	public void display() {
		System.out.println("독수리");		
	}
	public void performcry() {
		cry.cry();
	}
	public void performFly() {
		fly.fly();
	}

}
