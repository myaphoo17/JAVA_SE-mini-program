package Area;

public class Rectangle extends Length {
	int width;
	int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void calculateArea() {
		int area = width * height;
		System.out.println("The area of rectangle is " + area);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
