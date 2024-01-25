// StringTokenizer의 기능
// StringTokenizer의 기능과 유사한 String의 split메소드 사용법
/*
 * *** StringTokenizer : 010-1234-5678 토큰 분리***
 * 010
 * 1234
 * 5678
 * *** String의 split 메소드 이용 : 010-1234-5678 토큰 분리 ***
 * 010
 * 1234
 * 5678
 */
package ex11_3_StringTokenizer;
public class StringTokenizerExample6_2 {
	public static void main(String args[]) {
		String str = "010-1234-5678";
		String[] phoneNum = str.split("-");
		for (String part : phoneNum) {
            System.out.println(part);
        }
	}
}

/*
 * import java.util.StringTokenizer;

public class StringTokenizerExample6_2 {
    public static void main(String args[]) {
        String str = "010-1234-5678";
        String[] phoneNum = str.split("-");
        
        for (String part : phoneNum) {
            System.out.println(part);
        }
    }
}

 */

/*
public class StringTokenizerExample {
public static void main(String[] args) {
    String input = "사과=10|초콜렛=3|샴페인=1";

    // 정규 표현식을 사용하여 = 또는 |을 구분자로 사용
    String[] tokens = input.split("[=|]");

    // 출력
    for (String token : tokens) {
        System.out.print(token + "\t");
    }
}
}
*/

/*
package ex11_3_StringTokenizer;
import java.util.StringTokenizer;

class StringTokenizerExample5 {
    public static void main(String args[]) {
        // true : 구분자도 토큰으로 추출하도록 만드는 인자
        StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|");
        // 구분자 투입 //구분자

        System.out.println("상품이름\t상품 수");
        while (stok.hasMoreTokens()) { // 토큰이 있는 동안 반복하는 메서드
            String token = stok.nextToken();

            if (token.equals("=")) {
                System.out.print("\t");
            } else if (token.equals("|")) {
                System.out.println();
            } else {
                System.out.print(token);
            }
        }
    }
}
*/
