package oops_p;
class Circle{
	void caclulateArea(double radius) {
		double area =3.14159*radius*radius;
		System.out.println("Radius: "+ radius);
		System.out.println("Area of the circle:"+area);
		}
}
public class AreaCircle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c= new Circle();
c.caclulateArea(2.5);;
	}

}
