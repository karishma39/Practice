package Prac1;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Input : s = "qwertyu" 
//		        d = 2
//		Output : Left rotation : "ertyuqw"
//		         Right rotation : "yuqwert"
		
		String s="qwertyu" ;
		int d=2;
		
		String left = s.substring(d) + s.substring(0, d);
		System.out.println("Left roatation: "+left);
		
		String right = s.substring(s.length()-d) + s.substring(0, s.length()-d);
		System.out.println("Right roatation: "+right);

	}

}
