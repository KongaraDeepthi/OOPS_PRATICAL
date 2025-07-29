package oops_p;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple,banana,grape,orange";
        String[] fruits = s.split(",");
        for(String fruit : fruits) {
            System.out.println(fruit);
	}
}
}