package oops_p;
class Method_Circle {
    double radius = 5.0;

    void area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Method_Circle c = new Method_Circle();
	        c.area();

	}

}
