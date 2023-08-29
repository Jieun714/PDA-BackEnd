package FactoryMethod;

/**
 * Factory를 상속받아 구체적인 내용을 구현하는 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class IDCardFactory extends Factory{

	/**
	 * IDCard의 String인자를 가진 생성자의 인스턴스를 생성하는 메소드
	 * @param owner 인스턴스를 생성할 명명
	 * @return new IDCard(owner) IDCard의 인스턴스  
	 * */
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	/**
	 * 만들어진 제품을 등록할 메소드
	 * IDCard에 Override된 toString() 형식으로 product 출력  
	 * @param product 제품명
	 * */
	@Override
	protected void registerProduct(Product product) {
		System.out.printf("%s을 등록했습니다.\n", product);
	}
}
