package ex11_1_String_test2;

public class StringExample3_method {

    static boolean checkLength(String zumin) {
        return zumin.length() == 14;
    }

    static String pandanGender(String zumin) {
        String s = zumin.substring(7, 8);

        String result = switch (s) {
            case "1", "3" -> "남자";
            case "2", "4" -> "여자";
            default -> "외국인";
        };

        result = result + "입니다.";

        return result;
    }

    static boolean checkHyphen(String zumin) {
        return zumin.contains("-");
    }

    static int isNumber(String zumin) {
        for (int i = 0; i < zumin.length(); i++) {
            if (i != 6 && (zumin.charAt(i) < '0' || zumin.charAt(i) > '9')) {
                return i;
            }
        }
        return -1;
    }

    static String isNumberMessage(String zumin) {
        int index = isNumber(zumin);
        if (index >= 0) {
            if (index <= 5) {
                return "주민번호 앞자리를 숫자로 입력하세요";
            } else if (index >= 7 && index <= 12) {
                return "주민번호 뒷자리를 숫자로 입력하세요";
            }
        }
        return pandanGender(zumin) ;
    }

    static void print(boolean checkLength, boolean checkHyphen, String zumin) {
        if (checkLength && checkHyphen) {
            System.out.println(isNumberMessage(zumin));
        } else if (!checkLength) {
            System.out.println("주민등록번호는 14자리입니다. 다시 입력하세요.");
        } else {
            System.out.println("-을 넣어주세요");
        }
    }

    public static void main(String args[]) {
        String zumin = "123456-1830123";

        print(checkLength(zumin), checkHyphen(zumin), zumin);
    }
}

/* isNumber 메서드
 * (1) 매개변수 : 주민번호 (String)
 * (2) 주민번호를 차례대로 비교해서 숫자가 아닌 경우 해당 인덱스를 리턴.
 * 	단, -은 숫자인지 비교하지 않음
 * 	만약 앞자리와 뒷자리가 숫자이면 -1을 리턴.
 * 예) String zumin = "123456-a890123";
 * 출력결과) 주민번호 뒷자리를 숫자로 입력하세요
 * 
 * static String isNumber_Message(String zumin)
 * (1)isNumber(zumin)의 값이 0~5사이면 "주민번호 앞자리를 숫자로 입력하세요" 리턴
 * (2)isNumber(zumin)의 값이 7~13사이면 "주민번호 뒷자리를 숫자로 입력하세요" 리턴
 * (3)isNumber(zumin)의 값이 -1이면 pandan_gender(zumin)+" 입니다."리턴

print()
(1) check_length(zumin)를 호출 후 참이면
check_hyphen(zumin)을 호출 후 참이면 isNumber_Message(zumin) 호출 후 리턴된 값 출력
check_hypehn(zumin)을 호출 후 거짓이면 "-을 넣어주세요"를 출력.
(2) check_length(zumin)을 호출 후 거짓이면 "주민등록번호는 14자리 입니다." 출력
*/

/*
package ex11_1_String_test2;

public class StringExample3_method {

    static boolean check_length(String zumin) {
        return zumin.length() == 14;
    }

    static String pandan_gender(String zumin) {
        String s = zumin.substring(7, 8);

        String result = switch (s) {
            case "1", "3" -> "남자";
            case "2", "4" -> "여자";
            default -> "외국인";
        };

        result = result + "입니다.";

        return result;
    }

    static boolean check_hyphen(String zumin) {
        return zumin.substring(6, 7).equals("-");
    }

    static int isNumber(String zumin) {
        for (int i = 0; i < zumin.length(); i++) {
            if (zumin.charAt(i) < '0' || zumin.charAt(i) > '9') {
                return i;
            }
        }
        return -1;
    }

    static String isNumber_Message(String zumin) {
        int index = isNumber(zumin);
        if (index >= 0 && index <= 5) {
            return "주민번호 앞자리를 숫자로 입력하세요";
        } else if (index >= 7 && index <= 13) {
            return "주민번호 뒷자리를 숫자로 입력하세요";
        } else if (index == -1) {
            return pandan_gender(zumin) + " 입니다.";
        } else {
            return ""; // Handle other cases if needed
        }
    }

    static void print(boolean check_length, boolean check_hyphen, String gender, String zumin) {
        if (check_length) {
            if (check_hyphen) {
                System.out.println(isNumber_Message(zumin));
            } else {
                System.out.println("-을 넣어주세요");
            }
        } else {
            System.out.println("주민등록번호는 14자리 입니다.");
        }
    }

    public static void main(String args[]) {
        String zumin = "123456-3890123";
        print(check_length(zumin), check_hyphen(zumin), pandan_gender(zumin), zumin);
    }
}

*/

/*
import java.util.Scanner;

public class StringExample3_method {

    static boolean checkLength(String zumin) {
        return zumin.length() == 14;
    }

    static String pandanGender(String zumin) {
        String s = zumin.substring(7, 8);

        String result = switch (s) {
            case "1", "3" -> "남자";
            case "2", "4" -> "여자";
            default -> "외국인";
        };

        result = result + "입니다.";

        return result;
    }

    static boolean checkHyphen(String zumin) {
        return zumin.contains("-");
    }

    static int isNumber(String zumin) {
        for (int i = 0; i < zumin.length(); i++) {
            if (i != 6 && i != 13 && (zumin.charAt(i) < '0' || zumin.charAt(i) > '9')) {
                return i;
            }
        }
        return -1;
    }

    static String isNumberMessage(String zumin) {
        int index = isNumber(zumin);
        if (index >= 0) {
            if (index <= 5) {
                return "주민번호 앞자리를 숫자로 입력하세요";
            } else if (index >= 7 && index <= 12) {
                return "주민번호 뒷자리를 숫자로 입력하세요";
            }
        }
        return pandanGender(zumin) + " 입니다.";
    }

    static void print(boolean checkLength, boolean checkHyphen, String zumin) {
        if (checkLength && checkHyphen) {
            System.out.println(isNumberMessage(zumin));
        } else if (!checkLength) {
            System.out.println("주민등록번호는 14자리입니다. 다시 입력하세요.");
        } else {
            System.out.println("-을 넣어주세요");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 (앞자리6자리-뒷자리7자리): ");
        String zumin = scanner.nextLine();

        print(checkLength(zumin), checkHyphen(zumin), zumin);
    }
}
*/