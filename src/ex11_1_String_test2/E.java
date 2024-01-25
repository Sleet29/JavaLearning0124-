package ex11_1_String_test2;

public class E {
	static boolean check_length(String zumin){
		//return zumin.length() == 14; // ? true : false;
		return zumin.length() != 14 ? false : true; // ? true : false;
	}

	static String pandan_gender(String zumin){
		String s = zumin.substring(7,8);
		
		String result = switch(s) {
		case "1","3" -> "남자";
		case "2","4" -> "여자";
		default -> "외국인";
		};
		
		result = result+("입니다.");
		
		return result;
	}
	
	public static void main(String args[]) {
        String zumin = "123456-3890123";
        print(check_length(zumin),check_hyphen(zumin), pandan_gender(zumin));
    }
	
	static boolean check_hyphen(String zumin) {
        return zumin.substring(6, 7).equals("-");
    }

    static void print(boolean check_length, boolean check_hyphen, String gender) {
        if (check_length) {
            if (check_hyphen) {
            	System.out.println(gender);
            } else {
            	System.out.println("-을 넣어주세요");
            }
        } else {
            System.out.println("주민등록번호는 14자리 입니다.");
        }
    }
}    
    

/*
package ex11_1_String_test2;

public class E {
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

    public static void main(String args[]) {
        String zumin = "123456-3890123";
        print(check_length(zumin), check_hyphen(zumin), pandan_gender(zumin));
    }

    static void print(boolean check_length, boolean check_hyphen, String gender) {
        if (check_length) {
            if (check_hyphen) {
                System.out.println(gender);
            } else {
                System.out.println("-을 넣어주세요");
            }
        } else {
            System.out.println("주민등록번호는 14자리 입니다.");
        }
    }
}

*/