package exercise1;

public class Person {
//Data Abstraction of Person in Game 
	
	//name String type
	private String name ;
	//score integer type
	private int score;
	//positionX integer type
	//positionY integer type
	private int positionX, positionY;
	
	//Constructor Method Person()
	public Person() {
		//set default values to instance variables 
		name = "undefined" ;
		positionX = 100 ;
		positionY = 100 ;
	}
	
	//Function Abstraction of Person in Game
	//getName()
	public String getName() {
		return name;
	}
	//getScore()
	public int getScore() {
		return score ;
	}
	
	//setName()
	public void setName(String newName) {
		name = newName ;
	}
	
	//setScore()
	public void setScore(int newScore) {
		score = newScore ;
	}
	
	//move()
	public void move(int x1, int y1) {
		positionX = x1 ;
		positionY = y1 ;	
	}
	
	//get x,y
	public int getPositionX() {
	    return positionX;
	}
	public int getPositionY() {
	    return positionY;
	}
	
}
