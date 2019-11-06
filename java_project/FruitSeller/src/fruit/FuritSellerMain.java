package fruit;

public class FuritSellerMain {

	public static void main(String[] args) {
		
		// 셀러 생성
		FruitSeller seller;	 // 참조변수 생성 :인스턴스의 주소를 저장
		seller = new FruitSeller();	// 인스턴스 생성 -> 인스턴스 메모리의 주소값을 반환
		// 바이어 생성
		FruitBuyer buyer = new FruitBuyer();
		
		
		// 구매자가 5000 원 어치 사과를 구매
		buyer.buyApple(seller, 3000);
		
		System.out.println("판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("구매자의 현재 상황");
		buyer.showBuyResult();
		
		
		
		
		
		
		
		

	}

}
