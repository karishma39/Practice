package Prac1;

import java.util.ArrayList;
import java.util.List;

public class StreamsPrac1 {
	
	public static void main(String args[])
	{
		List<String> names = new ArrayList<String>();
		names.add("ana");
		names.add("kiran");
		names.add("tom");
		names.add("amy");
		names.add("apurva");
		
		names.stream().forEach(s -> System.out.println(s));
		System.out.println("print names starting with \"a\" and having length 3");
		names.stream().filter(s -> s.startsWith("a") && s.length()==3).forEach(s -> System.out.println(s));
	}

}
