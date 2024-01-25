// StringTokenizer을 이용해서 문자열로부터 토큰을 분리하는 프로그램
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

class StringTokenizerExample4 {
	public static void main(String args[]) {
		// true : 구분자도 토큰으로 추출하도록 만드는 인자
		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true);
													// 구분자 투입 //구분자
		while(stok.hasMoreTokens()) { // 토큰이 있는 동안 반복하는 메서드
			String token = stok.nextToken();
			System.out.print(token);
		}
	}
}