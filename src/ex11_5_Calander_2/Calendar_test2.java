/*
0. 상속관계
java.lang.Object
	java.util.Calendar
		java.util.GregorianCalendar

Calendar는 추상 클래스로 이렇게 사용할 수 없습니다.
1. Calendar c = new Calendar();

2. Calendar 사용법 두가지
	하나)정적 메소드를 이용해서 사용하는 방법
		Calendar c1= Calendar.getInstance();
		getInstance() : Calendar 클래스를 구현한 클래스의 인스턴스를 반환
		getInstance() 메소드는 달력 필드가 현재 날짜 및 시간으로 초기화 된 Calendar 객체를 반환합니다.
	둘) 업캐스팅 방법(자식의 주소를 부모의 자료형을 가진 변수에 저장)
		Calendar c2 = new GregorianCalendar();

3. GregorianCalendar c = new GregorianCalendar();
*/

package ex11_5_Calander_2;
import java.util.*;
public class Calendar_test2 {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("출력할 년도를 입력하세요>");
		int Y = sc.nextInt();
		System.out.print("출력할 달을 입력하세요>");
		int M = sc.nextInt();
		
		Calendar calendar = new GregorianCalendar(Y,M-1,1);
		int lastday = calendar.getActualMaximum(Calendar.DATE);
		int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("\t\t\t"+Y+"년"+"\t"+M+"월");
		
		String yoil[] = {"일", "월", "화", "수", "목", "금", "토"};
		for(int i=0;i<yoil.length;i++) {
			System.out.print(yoil[i]+"\t");
		}
		System.out.println();
			
		System.out.println("=================================================================");
        
        for (int i = Calendar.SUNDAY; i < day_of_week; i++) {
            System.out.print("\t");
        }

        for (int day = 1; day <= lastday; day++) {
            System.out.printf(day+"\t");

            if (((day_of_week)+day) % 7 == 1) {
                System.out.println();
            }
        }
	sc.close();	
	}
}

