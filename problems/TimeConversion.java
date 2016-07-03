


import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*

Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤1201≤hh≤12.

Output Format

Convert and print the given time in 24-hour format, where 00≤hh≤2300≤hh≤23.

Sample Input

07:05:45PM
Sample Output

19:05:45
Explanation

7 PM is after noon, so you need to add 12 hours to it during conversion. 12 + 7 = 19. Minutes and seconds do not change in 12-24 hour time conversions, so the answer is 19:05:45.


*/
public class TimeConversion {

	public static void main(String[] args) { 
		
	Scanner sc = new Scanner(System.in);
    String d = sc.next();

    try {
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss"); //if wanting we can print aa = AM/PM 
        Date date = df.parse(d);
        System.out.println(out.format(date));
    } catch (ParseException e) {
        e.printStackTrace();
    }
	}
}

/*
  
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
class DateTimeFormatDemo
{
   public static void main(String[] args)
   {
      String input = "23/12/2014 10:22:12 PM";
      //Format of the date defined in the input String
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         //Converting the input String to Date
    	 date= df.parse(input);
         //Changing the format of date and storing it in String
    	 output = outputformat.format(date);
         //Displaying the date
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
   }
}

*/
