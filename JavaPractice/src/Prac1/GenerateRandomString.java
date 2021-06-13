package Prac1;

import java.nio.charset.Charset;
import java.util.Random;

//Emp: id, name,dept
//select count(*) from emp group by dept;

public class GenerateRandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=createString(5); //Create random string of given size
		System.out.println("Random String= "+s);
		
	}
	
	public static String createString(int n)
	{
		 // length is bounded by 256 Character
        byte[] array = new byte[256];
        new Random().nextBytes(array);
  
        String randomString
            = new String(array, Charset.forName("UTF-8"));
  
        // Create a StringBuffer to store the result
        StringBuffer r = new StringBuffer();
  
        // remove all spacial char
        String  AlphaNumericString
            = randomString
                  .replaceAll("[^A-Za-z0-9]", "");
        
        for(int i=0;i<n;i++)
        {
        	r.append(AlphaNumericString.charAt(i));
        }
		
		return r.toString();
		
	}
	
	
}
