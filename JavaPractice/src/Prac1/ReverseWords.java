package Prac1;

import java.util.Arrays;

public class ReverseWords {
	
	////		Write logic to convert the given input string into output string
//	input = "Hello World"
//	output = "olleH dlroW"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello World";
		String output="";
		String[] arr= str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer s=new StringBuffer(arr[i]);
			output+=s.reverse()+" ";
		}
		
		System.out.println(output);

	}

}



"Write a query to find the details of employee having 4th highest salary
from the table name ""Employee"" having 1lakh records""
		
Colums of the table are defined as
"EmpID,EmpName,EmpDept,EmpSalary"

select * from Employee where EmpSalary
=(select min(EmpSalary) from Employee order by EmpSalary desc limit 4) 



"Write down output for left join and right join for the two given tables
table1: Country
table2: City"








country_id	country_name	
1				India	
2				USA	
3			Sri Lanka	
		
city_id	city_name	country_id
11		Delhi			1
12		Karachi			NULL
13		California		2
14		Mumbai			1

Left join o/p:
	1 India 11 Delhi
	1 India 14 Mumbai
	2 USA 13 California 
	3 Srilanka null null
	
Right join o/p:
	
