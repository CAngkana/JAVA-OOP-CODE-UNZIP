package Main;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	/*
	//constructor method default constructor
	// must same name as class
	// EX. a = new a();
	public Rectangle() {
		
		// no return
	}
	*/
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	// Constructor แบบรับค่า
	// Overloaded Constructor   ส่งค่า parametr ให้เราใช้
	public Rectangle(int x, int y ,int w ,int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	
	public boolean equals(Rectangle rect) {
		return (this.width == rect.getWidth() && this.height == rect.getHeight());
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1,1,5,10);
		Rectangle rect2 = new Rectangle(0,0,5,10);
		
		System.out.println(rect1.equals(rect2));
		//ความกว้างของ rect1 = ความกว้างของ rect2 ไหม
		//height ของ rect1 = height ของ rect2 ไหม
	}

}
