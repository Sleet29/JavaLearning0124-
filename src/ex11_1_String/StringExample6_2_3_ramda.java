package ex11_1_String;

public class StringExample6_2_3_ramda {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		
		String s = jumin.substring(7,8);
		System.out.println("추출한 숫자는 "+ s + "이고 ");
		
		// -> (화살표 케이스 라벨)을 사용하면 마지막에 break를 사용한 것과 동일합니다.
		// -> 를 사용할 때 실행문이 여러 개이면 중괄호로 묶어줘야 합니다.
		
		switch(s) {
		case "1","3" -> System.out.println("남자입니다.");
		
		case "2","4" -> System.out.println("여자입니다.");
		
		default ->	System.out.println("외국인입니다.");
		
		}
	}
}
