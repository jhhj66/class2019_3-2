package kr.ac.daelim.uml.zoo;

public class Zoo {

	static Animal tiger,pigeon,turtle,eagle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger = new Tiger();
		eagle = new Eagle();
		turtle = new Turtle();
		pigeon = new Pigeon();

		tiger.display();
		tiger.performFly();
		tiger.performCry();
		
		turtle.display();
		turtle.performFly();
		turtle.performCry();
		
		eagle.display();
		eagle.performFly();
		eagle.performCry();

		pigeon.display();
		pigeon.performFly();
		pigeon.performCry();
	}

}
