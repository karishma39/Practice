package Prac1;

public class StringRotation {

	public static void main(String[] args) {

		//PROGRAM 1 - Rotate a String left and right by 2 places
		

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
		
		
		//PROGRAM 2 - All rotations of a String
		
//		Input : S = "geeks"
//				Output : geeks
//				         eeksg
//				         eksge
//				         ksgee
//				         sgeek

		String str="geeks" ;
		int l=str.length();
		str=str.concat(str); //geeksgeeks
		
		for(int i=0; i<l; i++)
		{
			System.out.println(str.substring(i, l+i));
		}
		
	}

}
