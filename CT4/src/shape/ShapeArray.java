package shape;

public class ShapeArray {
	public static void main(String[] args) {
		Sphere mySphere = new Sphere(110);
		Cylinder myCylinder = new Cylinder(45, 9);
		Cone myCone = new Cone(82, 26);
		Shape[] shapeArray = {mySphere, myCylinder, myCone};
		
		for (Shape shape: shapeArray) {
			System.out.println(shape.toString());
		}
		
	}
}
