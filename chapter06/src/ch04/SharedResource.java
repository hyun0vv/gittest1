package ch04;

class BankAccount{
	
	private int money = 100_000;
	
	// getter
	public int getMoney() {
		return this.money;
	}
	
	//setter
	public void setMoney(int money) {
		if(money <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.money = money;
		}
	}
	
	// 입금기능
	public synchronized void saveMoney(int money) {
		// 10만원 상태
		int currentMoney = getMoney();
		
		System.out.println("메서드 동작 확인 1 : saveMoney");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
		
	}
	
	// 출금기능
	public void withdrawMoney(int money) {
		
		synchronized (this) {
		
		int currentMoney = getMoney();
		
		System.out.println("메서드 동작 확인 2 : withdrawMoney");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 방어적 코드
		// Todo
		// 현재금액보다 출금하려는 금액이 크면 출금x
		if(currentMoney < money) {
			System.out.println("잔액이 부족합니다.");
		}else {
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 : " + getMoney());
		}
		System.out.println("현재 잔액 : " + getMoney());
		}
	}
	
}// end of bankAccount클래스


class Father extends Thread{
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);
	}
	
}


class Mother extends Thread{
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 출금하기
		account.withdrawMoney(500_000);
	}
}


public class SharedResource {

	public static void main(String[] args) {
		
		
		// 현재 10만원이 저금되어 있는 상태로 객체 생성
		
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		
		// 아버지가 입금하는 동작
		father.start();
		
		// 엄마가 출금하는 동작
		mother.start();
		
		// 정상처리 금액 : 10만원 + 1만원 - 5천원 = 10만 5천원
		// 결과값 110,000 의도치않은결과가 나옴
		
		// 동기화 필요함
		// 임계 영역이 발생될때는 ( 작업자 간의 자원을 공유하는 상태 )
		// 현재 자원 ( 데이터) 사용하고 있기 때문에 보호 처리를 해주어야한다.
		// 다른 작업자가 사용하지 못하도록 lock을 걸어준다.
		// 순서를 지켜서 작업을 하게한다.
		
		// 하는 방법
		// 1. synchronized 메서드
		// 2. synchronized 블록
		
		
		
	}

}
