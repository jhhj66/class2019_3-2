package kr.ac.daelim.uml.zoo;

public class Tiger extends Animal{

	public Tiger() {
		cry = new TigerCry();
		fly = new FlyNoWay();
		
	}
	@Override
	public void display() {
		System.out.println("호랑이");		
	}
	
	public void performcry() {
		cry.cry();
	}
	public void performFly() {
		fly.fly();
	}


}