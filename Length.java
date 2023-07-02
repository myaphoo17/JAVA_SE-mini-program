package Area;

public class Length {

	int feet;
	int inches;

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public int convertInches(int feet) {
		int inch = feet * 12;
		return inch;

	}

	public void convertLength(int inch, int inches) {
		int length = inch + inches;
		System.out.println("the length is " + length);

	}

	@Override
	public String toString() {
		return "Length []";
	}

	public static void main(String[] args) {
		Length l = new Length();
		l.setFeet(8);
		l.setInches(7);
		l.convertLength(8, 7);

		Circle c = new Circle();
		c.PI = 3.14;
		c.setRadius(5);
		System.out.println(c);
		c.calculateArea();

		Rectangle r = new Rectangle();
		r.setWidth(8);
		r.setHeight(9);
		System.out.println(r);
		r.calculateArea();

	}

}
