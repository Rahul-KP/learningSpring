package springlearning;

public class Triangle implements Shape{
	
	Point pointA;
	Point pointB;
	Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {
		System.out.println("Triangle drawn ");
		System.out.println(getPointA().getX() + " " + getPointA().getY());
		System.out.println(getPointB().getX() + " " + getPointB().getY());
		System.out.println(getPointC().getX() + " " + getPointC().getY());
	}
}