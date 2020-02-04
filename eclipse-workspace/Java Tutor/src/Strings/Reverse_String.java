package Strings;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String s="madam";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			
			a+=s.charAt(i);
			
		}
		System.out.println(a);

		if(s.equals(a)) {
			System.out.println("polyndrom");
		}
		else {
			System.out.println("not");
		}
	
	}
}
