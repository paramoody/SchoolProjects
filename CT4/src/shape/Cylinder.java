package shape;

public class Cylinder extends Shape{
	private double height;
	private double radius;
	
	
	public Cylinder(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
	@Override
	public double surfaceArea() {
		//2π rh + 2π r2
		double pi = Math.PI;
		double surfaceArea = (2 * pi * radius * height) + (2 * pi * radius * radius);
		
		return surfaceArea;
	}
	@Override
	public double volume() {
		//V=πr2 h
		double pi = Math.PI;
		double volume = pi * radius * radius * height;
		
		
		return volume;
	}
	@Override
	public String toString() {
		return "Cylinder: surface area = " + surfaceArea() + ", volume = "
				+ volume() + ".";
	}
}
