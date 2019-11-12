package ver01;

public class PhoneInfor {
	
	//• 이름            name            String
	//• 전화번호       phoneNumber     String
	//• 생년월일       birthday        String	
	private String name;			// 홍길동
	private String phoneNumber;  	// 010-9018-8548
	private String birthday;		// 2019-11-12
	
	
	// 데이터 초기화
	public PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfor(String name, String phoneNumber){
		this(name, phoneNumber, null);
	}
	
	
	// 제이터 출력하는 메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		
		if(birthday == null) {
			System.out.println("생일 : 입력된 데이터가 없습니다.");
		} else {
			System.out.println("생일 : " + birthday);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
