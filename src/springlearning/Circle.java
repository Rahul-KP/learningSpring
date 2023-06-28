package springlearning;

public class Circle implements Shape {
	
	private Point center;
	
	public void setCenter(Point center) {
		this.center=center;
	}
	
	public Point getCenter(Point center) {
		return center;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle drawn with center " + getCenter(center).getX() + " " + getCenter(center).y);
	}
}