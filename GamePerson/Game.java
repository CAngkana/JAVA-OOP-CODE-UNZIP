package exercise1;

public class Game {

	public static void main(String[] args) {
		// Create 1 object from Class Person (instantiation) 
		//ClassName objectReference = new ConstructorMethod();
		Person Chatchaporn = new Person() ;
		
		Chatchaporn.setName("Chatchaporn");
		System.out.println("name:" + Chatchaporn.getName());
		System.out.println("score:" + Chatchaporn.getScore());

		//Move to positionX and positionY at 50,100
		//Change Name of me to your first name
		
		Chatchaporn.move(50,100);
		System.out.println("positionX: "+Chatchaporn.getPositionX());
		System.out.println("positionY: "+Chatchaporn.getPositionY());

	}

}
