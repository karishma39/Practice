
public class StringReversal {

	public static void main(String[] args) {

		String s= "abcde gh";
		System.out.println(rev(s));
		
	}

	private static String rev(String s) {

		if(s.length() <= 1 || s == null)
		return s;
		
		return  s.charAt(s.length() - 1) + rev(s.substring(0,s.length() - 1));
	}

}
