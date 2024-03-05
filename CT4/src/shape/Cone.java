package shape;

public class Cone extends Shape{
	private double radius;
	private double height;
	
	
	public Cone(double height, double radius) {
		super();
		this.radius = radius;
		this.height = height;
	}
	@Override
	public double surfaceArea() {
		// A=πr(r + sqrt(h2+r2))
		double pi = Math.PI;
		double surfaceArea = pi * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
		return surfaceArea;
	}
	@Override
	public double volume() {
		//V=πr2 h/3
		double pi = Math.PI;
		double volume = pi * (radius * radius) * (height / 3.0);
		return volume;
	}
	@Override
	public String toString() {
		return "Cone: surface area = " + surfaceArea() + ", volume = " + volume() + ".";
	}
	
}
