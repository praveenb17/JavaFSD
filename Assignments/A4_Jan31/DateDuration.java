// // Create a method to accept date and print the duration in days, months and years with
// // regards to current system date

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
//import java.text.DecimalFormat;

class DateDuration{
	public static void main(String[] args) {
		
		String curDate = CurDate();
		String inputDate = InputDate();
		totalDuration(curDate, inputDate);

	}

	public static String InputDate()
	{
		Scanner s = new Scanner(System.in);
		String inputDate = s.nextLine();
		return inputDate;
	}

	public static String CurDate()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date();
		
		String curDate = df.format(dateobj);
		return curDate;
	}	

	public static void totalDuration(String curDate, String inputDate) {

		try {
			String date1 = curDate;
			String date2 = inputDate;
			String format = "dd/MM/yyyy";
 
			SimpleDateFormat sdf = new SimpleDateFormat(format);
 
			Date dateObj1 = sdf.parse(date1); //Converting String to Date
			Date dateObj2 = sdf.parse(date2);
			System.out.println(dateObj1);
			System.out.println(dateObj2 + "\n");
 
			//getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object
			long diff = dateObj2.getTime() - dateObj1.getTime();
 
			int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
			System.out.println("difference between days: " + diffDays);

			int diffMonths = (int) (diff / (30 * 24 * 60 * 60 * 1000));
			System.out.println("difference between Months: " + diffMonths);

			int diffYears = (int) (diff / (365 * 30 * 24 * 60 * 60 * 1000));
			System.out.println("difference between Years: " + diffYears);
 		
 		} 
 		catch (Exception e) {
					e.printStackTrace();
		}
		
	}
}
