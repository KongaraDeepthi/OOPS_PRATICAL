package oops_p;

public class Replace_Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "ababab";
        System.out.println(s.replace('a', 'x'));         
        System.out.println(s.replace("ab", "xy"));     
        System.out.println(s.replaceAll("a.", "z"));    
        System.out.println(s.replaceFirst("ab", "xy"));
	
	}

}
