package Area;

public class Circle extends Length {
	double PI;
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		double area = PI * (radius * radius);
		System.out.println("The area of circle is" + area);
	}

	@Override
	public String toString() {
		return "Circle [PI=" + PI + ", radius=" + radius + "]";
	}

}
