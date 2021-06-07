package Prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitWithoutRemovingStringInQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: "This is "Java" xyz "yo tu hu" "Programming Language" abc ". (Don't break the string in quotes)
		//Output: [This, is, "Java", xyz, "yo tu hu", "Programming Language", abc]
		
		String s= "This is \"Java\" xyz \"yo tu hu\" \"Programming Language\" abc ";
		System.out.println(s);
		
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr)); //[This, is, "Java", xyz, "yo, tu, hu", "Programming, Language", abc]
		
		List list = new ArrayList();
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i].startsWith("\"") && arr[i].endsWith("\""))
			{
				temp+=arr[i];
				list.add(temp);
				temp="";
				
			}
			else if(arr[i].startsWith("\""))
			{
				temp+=arr[i];
			}
			else if(arr[i].endsWith("\""))
			{
				temp+=" "+arr[i];
				list.add(temp);
				temp="";
			}
			else if(!temp.isEmpty())
			{
				temp+=" "+arr[i];
			}
			
			else
			{
				list.add(arr[i]);
			}
			
		}
		
		System.out.println(list);
		

	}

}
