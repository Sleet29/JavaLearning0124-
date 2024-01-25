package ex11_1_String;

public class StringExample8_2_lastindexOf2 {
	public static void main(String args[]) {
						//0123456789012345678901234567890123
		String message = "Java program creates many objects.";
		
		// 지정된 문자가 최초로 위치한 인덱스를 구합니다.
		// 존재하지 않는 경우 -1을 리턴합니다.
		// 문자열 앞에서부터 차례대로 검색합니다.
		int index1 = message.indexOf('a');
		System.out.println("a의 위치는 "+index1);
		
		// 아스키코드 97은 소문자 'a'
		int index2 = message.indexOf(97);
		System.out.println("a의 위치는 "+index2);
		
		// 아스키코드 65는 대문자 'A'
		int index23 = message.indexOf(65);
		// 'A'가 없을 때는 index 값은 -1을 반환합니다.
		System.out.println("A의 위치는"+index23);
		
		int index3 = message.indexOf('a',13);
		System.out.println("13번부터 a의 위치는 "+index3);
		
		// "av"의 시작 index를 찾습니다.
		int index4 = message.indexOf("av");
		System.out.println("av로 시작하는 index는 "+index4);
		
		// index번호 12번째 부터 "man"의 시작 index를 찾습니다.
		int index5 = message.indexOf("man", 12);
		System.out.println("12번째 부터 man위치는"+index5);
		
		int index6 = message.indexOf("java");
		System.out.println("java의 위치는"+index6);
	}

}
