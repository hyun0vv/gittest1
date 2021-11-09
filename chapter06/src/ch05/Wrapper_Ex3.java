package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str2);
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean형으로 변경완료");
		}
		System.out.println();
		
		
		// 문제1
		String str10 = "1001";
		String str11 = "2001";
		
		// str10과 str11을 덧셈연산해주세요
		// 결과값까지 출력
		// str10과 str11을 곱셈연산해주세요
		
		
		int num1 = Integer.parseInt(str10) + Integer.parseInt(str11);
		int num2 = Integer.parseInt(str10) * Integer.parseInt(str11);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		
		
		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println(b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println(i);
		System.out.println("문자열 short값 변환 : " + s);
		//
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);// 제대로 형이 안맞으면 false
	}

}
