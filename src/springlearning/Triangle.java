package springlearning;

public class Triangle {
	String type;
	int height;

	//note that these constructors and setter functions must be compulsorily public
	//if you don't mention anything , then it is package-private (default) , but the spring.xml must be placed outside all packages
	//so theses functions have to be public
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	Triangle() {
		this.type="equilateral";
		this.height=10;
	}
	
	//use type attribute to distinguish between the following two constructors
	//Keep in mind that for String , you have to say java.lang.String in the xml file as the value
	//eg <constructor-arg type=java.Lang.String value="Isosceles"/>
	//for other data types you can just mention type,
	//eg <constructor-arg type=int value="10"/>
	Triangle(String type) {
		this.type = type;
	}
	
	Triangle(int height) {
		this.height = height;
	}
	
	//use index property to distinguish between the following two constructors
	Triangle(String type, int height) {
		System.out.println("Overloading 1");
		this.type = type;
		this.height = height;
	}
	
	Triangle(int height, String type) {
		System.out.println("Overloading 2");
		this.type = type;
		this.height = height;
	}
	
	void draw() {
		System.out.println("Triangle drawn of type " + getType() + " of height " + getHeight());
	}
}