/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertadtobs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
 
/**
 *
 * @author Suhana
 */
public class ConvertADtoBS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        System.out.println("Enter date in format dd/MM/yyyy:");
        String date = new Scanner(System.in).nextLine();
        
        System.out.println(validate(date) ? "True\n" + String.format("%s AD = %s BS",date,convert(date)) : false);
   
    }
    
    private static boolean validate(String dateToValidate){

        if(dateToValidate == null)
            return false;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);  // false = strict date validation

        try {
            sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static String convert(String adDate) throws ParseException {
        String getCurrentYear[] = adDate.split("/");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date current = df.parse(adDate);
        Calendar adCurrent = new GregorianCalendar(current.getYear(), current.getMonth(), current.getDate());
        Date start = null;
        long equBs = Lookup.lookupNepaliYearStart;
        Integer monthDay[] = null;
        for (int i = 0; i < Lookup.lookup.size(); i++) {
            String getStartYear[] = Lookup.lookup.get(i)[0].split("-");
            if (getStartYear[2].equals(getCurrentYear[2])) {
                DateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
                start = df1.parse(Lookup.lookup.get(i)[0]);
                monthDay = MonthInYear.monthDays.get(i);
                equBs += i;
                if (start.getTime() >= current.getTime()) {
                    start = df1.parse(Lookup.lookup.get(i - 1)[0]);
                    equBs -= 1;
                }
            }
        }
        Calendar adStart = new GregorianCalendar(start.getYear(), start.getMonth(), start.getDate());
        long diff = adCurrent.getTime().getTime() - adStart.getTime().getTime();
        long difference = diff / (1000 * 60 * 60 * 24);
        int nepYear = (int) equBs, nepMonth = 0, nepDay = 1, DaysInMonth;
        while (difference != 0) {
            if (difference >= 0) {
                DaysInMonth = monthDay[nepMonth];
                nepDay++;
                if (nepDay > DaysInMonth) {
                    nepMonth++;
                    nepDay = 1;
                }
                if (nepMonth >= 12) {
                    nepYear++;
                    nepMonth = 0;
                }
                difference--;
            }
        }

        nepMonth += 1;
        
        switch(nepMonth)
		
		{		
		case 1:
			System.out.println(nepYear+"/"+"बैशाख "+"/"+nepDay);
                      break;
			
		case 2:
			System.out.println(nepYear+"/"+"जेस्ठ"+"/"+nepDay);
			break;
		
		case 3:
			System.out.println(nepYear+"/"+"असार"+"/"+nepDay);
			break;
			
		case 4:
			System.out.println(nepYear+"/"+"ष्रवण"+"/"+nepDay);
			break;
			
		case 5:
			System.out.println(nepYear+"/"+"भड्र"+"/"+nepDay);
			break;
			
		case 6:
			System.out.println(nepYear+"/"+"असोज"+"/"+nepDay);
			break;
			
		case 7:
			System.out.println(nepYear+"/"+"कर्टिक"+"/"+nepDay);
			break;
		
                        case 8:
			System.out.println(nepYear+"/"+"मण्ग्सिर"+"/"+nepDay);
			break;
                        
                        case 9:
			System.out.println(nepYear+"/"+"पोउष"+"/"+nepDay);
			break;
                        
                        case 10:
			System.out.println(nepYear+"/"+"माघ"+"/"+nepDay);
			break;
                        
                        case 11:
			System.out.println(nepYear+"/"+"फल्गुण"+"/"+nepDay);
			break;
                        
                        case 12:
			System.out.println(nepYear+"/"+"चैट्र"+"/"+nepDay);
			break;
                        
		default:
			System.out.println("Incorrect month!!..");
			break;
		}
        
          
                        Year y = Year.of(nepYear);
                        boolean b = y.isLeap();
                        System.out.println("It is a leap year:::"+b);
			
        return nepYear + "/" + nepMonth + "/" + nepDay;
        
    }
}
