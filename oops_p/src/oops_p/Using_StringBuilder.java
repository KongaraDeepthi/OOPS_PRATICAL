package oops_p;

public class Using_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        sb.delete(0, 5);
	        sb.replace(0, 4, "Hi");
	        sb.reverse();
	        System.out.println(sb);  // Output varies

	}

}
