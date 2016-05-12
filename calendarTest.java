import java.util.Calendar;
import java.util.GregorianCalendar;
//set "PATH=%PATH%;C:\Program Files\Java\jdk1.6.0_18\bin"
class Test{
	public static void main(String[] args){
		try{
			Calendar rightNow = Calendar.getInstance();
			System.out.println(rightNow.get(Calendar.DATE));
		}
		catch(Exception ex){
			System.out.println("something is wrong");
		}
	}
}