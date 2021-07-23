package Prac1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetMonthFromDateWithValidation {

	public static void main(String[] args) throws ParseException {
		
		//String orgDate="07/21/2021";
		String orgDate="2021-July-21";
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MMMM-dd");
		Date date=null;
		
		if(isValidFormat(sdf2, orgDate))
		{
				 date=sdf2.parse(orgDate);
		}

		else if(isValidFormat(sdf1, orgDate))
		{
			 date=sdf1.parse(orgDate);
		}
		
		System.out.println(date.getMonth()+1);

}
	
	public static boolean isValidFormat(SimpleDateFormat sdf, String value) {
        Date date = null;
        try {
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
                
            }
            
        } 
        catch (ParseException ex) {
           return false;
        }
        return date != null;
    }
	
}
