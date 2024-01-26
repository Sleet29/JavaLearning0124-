package ex11_5_Calander_2;
import java.util.*;
public class Calendar_test {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		int Y = sc.nextInt();
		System.out.print("출력할 달을 입력하세요>");
		int M = sc.nextInt();
		
		Calendar calendar = Calendar.getInstance();
        calendar.set(Y, M - 1, 1); // month is zero-based in Calendar

		
		
		
		System.out.println("\t\t\t"+Y+"년"+"\t"+M+"월");
		System.out.println("\t"+"일"+"      "
						   +" 월"+"      "
						   +"  화"+"      "
						   +"  수"+"      "
						   +" 목"+"      "
						   +"  금"+"      "
						   +"  토"+"      ");
		System.out.println("=================================================================");
		int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("         ");
        }

        for (int day = 1; day <= maxDayOfMonth; day++) {
            System.out.printf("      %3d", day);

            if ((day + firstDayOfWeek - 1) % 7 == 0 || day == maxDayOfMonth) {
                System.out.println();
            }
        }
	sc.close();	
	}
}

/*
import java.util.Scanner;
import java.util.Calendar;

public class CalendarExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.print("Enter year (e.g., 2024): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // month is zero-based in Calendar

        // Print the header
        System.out.println("Calendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print the calendar
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print leading spaces
        for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= maxDayOfMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line for the next week
            if ((day + firstDayOfWeek - 1) % 7 == 0 || day == maxDayOfMonth) {
                System.out.println();
            }
        }

        // Close the scanner
        scanner.close();
    }
}

 */
 
