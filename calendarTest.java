import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
//set "PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_60\bin"
class Test{
	public static void main(String[] args){
		try{
			//have to get a calendar instance of class
			Calendar cal = Calendar.getInstance();
			
			//adding days
			cal.add(Calendar.DATE, 19);
			
			//rolls the month forward one and fixes the date
			cal.roll(Calendar.MONTH, true);
			
			//prints the new full time stamp
			System.out.println(cal.getTime());
			
			//an easier way to print timestamp
			Date date = cal.getTime();
			System.out.println(date);
			
			//add
			Calendar calTemp;
			calTemp = (Calendar) cal.clone();
			calTemp.add(Calendar.HOUR_OF_DAY, 11);
			System.out.println("After 11 hours, it will be: " + calTemp.getTime());

			// Roll: roll only moves the field, nothing else
			// unless the other field is not in normal range anymore
			calTemp = (Calendar) cal.clone();
			calTemp.roll(Calendar.HOUR_OF_DAY, 11);
			System.out.println("Roll 11 hours, it will be: " + calTemp.getTime());
			System.out.println();
		
		}
		catch(Exception ex){
			System.out.println("something is wrong");
		}
	}
}