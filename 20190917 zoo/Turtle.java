package kr.ac.daelim.uml.zoo;

public class Turtle extends Animal{

	public Turtle() {
		cry = new CryNoWay();
		fly = new FlyNoWay();
		
	}
	@Override
	public void display() {
		System.out.println("거북이");		
	}
	
	public void performcry() {
		cry.cry();
	}
	public void performFly() {
		fly.fly();
	}


}