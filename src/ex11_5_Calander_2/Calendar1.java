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
public class Calendar1 {
	
	public static void main(String args[]) {
        Calendar today = Calendar.getInstance();
        //Calendar c1 = new GregorianCalendar(2024,0,1);
		/*
        System.out.println("이 해의 년도 : "+today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월): " + (today.get(Calendar.MONTH)+1));
        System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이 달의 며칠: " + today.get(Calendar.DATE));
        System.out.println("요일 (1~7, 1:일요일): " + getDayOfWeek(today.get(Calendar.DAY_OF_WEEK)));
        System.out.println("이 달의 몇번 째 무슨요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후): "+ today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): "+ today.get(Calendar.SECOND));
        System.out.println("이 달의 마지막 날: "+today.getActualMaximum(Calendar.DATE));
        System.out.println("1000분의 1초(0~999): "+today.get(Calendar.MILLISECOND));
        */
        
        String yoil;

        if(today.get(Calendar.AM_PM) == Calendar.AM) {
            yoil = "오전";
        } else {
            yoil = "오후";
        }

        System.out.println(today.get(Calendar.YEAR)+"년 "+
                (today.get(Calendar.MONTH)+1)+"월 "+
                today.get(Calendar.DATE)+"일 "+
                yoil+" "+
                today.get(Calendar.HOUR)+":"+
                today.get(Calendar.MINUTE)+":"+
                today.get(Calendar.SECOND)+
                " "+getDayOfWeek(today.get(Calendar.DAY_OF_WEEK))+
                "입니다.");
    }

    private static String getDayOfWeek(int dayOfWeek) {
        String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        return days[dayOfWeek - 1];
    }
}

