package shape;

public class Sphere extends Shape{
	private double radius;
	

	public Sphere(double radius) {
		
		this.radius = radius;
	}

	

	@Override
	public String toString() {
		return "Sphere: surface area = " + surfaceArea() + ", volume = " + volume() + ".";
	}



	@Override
	public double surfaceArea() {
		//4pi r ^2
		double pi = Math.PI;
		double surfaceArea = 4 * pi * (radius * radius);
		return surfaceArea;
	}

	@Override
	public double volume() {
		//V=4/3πr^3
		double pi = Math.PI;
		double volume = (4.0/3.0) * pi * (radius * radius * radius);
		return volume;
	}

}
