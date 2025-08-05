package oops_p;

class Triangle{
	void Area(double base,double height) {
		double area = 0.5*base*height;
		System.out.println("Base: "+base);
		System.out.println("Height:"+height);
		System.out.println("Area of triangle:"+area);
	}
}
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Triangle t= new Triangle();
t.Area(10.0,5.0);
}

}
