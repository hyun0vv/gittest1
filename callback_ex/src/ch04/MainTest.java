package ch04;

public class MainTest {

	public static void main(String[] args) {

		Activity1 activity1 = new Activity1("메인 화면");
		
		Activity2 activity2 = new Activity2("서브 화면");
		
		activity2.setCallbackCheckPosition(activity1.checkPosition);
	}

}
