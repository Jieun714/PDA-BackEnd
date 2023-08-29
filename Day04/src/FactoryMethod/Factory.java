package FactoryMethod;

/**
 * 제품을 만들고, 등록하는 추상 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public abstract class Factory {
	/**
	 * Product의 인스턴스를 생성 후 등록하는 메소드
	 * @param owner 등록할 명명 
	 * @return p 생성된 인스턴스
	 * */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	};
	
	/**
	 * 인스턴스를 생성하는 메소드 
	 * */
	protected abstract Product createProduct(String owner);
	
	/**
	 * 생성된 인스턴스를 등록하는 메소드 
	 * */
	protected abstract void registerProduct(Product product);
}
