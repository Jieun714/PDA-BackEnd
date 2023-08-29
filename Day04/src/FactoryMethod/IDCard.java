package FactoryMethod;

/**
 * Product를 상속받아 구체적인 내용을 구현하는 클래스
 * @author Jieun Lee
 * @version 1.0
 * */
public class IDCard extends Product{
	/**
	 * 명명(사람의 이름) 
	 * */
	private String owner;

	/**
	 * 기본 생성자 생성 
	 * */
	IDCard(){}
	
	/**
	 * 하나의 인자를 갖는 생성자
	 * 생성자에서 owner의 값을 수정해주기 때문에 setOwner가 필요로 하지않는다.
	 * @param owner 입력받은 이름 
	 * */
	IDCard(String owner) {
		System.out.printf("%s의 카드를 만듭니다.\n", owner);
		this.owner = owner;
	}
	
	/**
	 * 사용할 이름을 출력하는 메소드 
	 * */
	@Override
	public void use() {
		System.out.printf("%s을 사용합니다.\n", this.owner);
	}

	/**
	 * 출력 형식을 지정하는 메소드 
	 * 출력형식을 지정하지 않으면 FactoryMethod.IDCard@57fa26b7 처럼 @+hashCode가 출력된다 
	 * @return "[IDCard:" + owner + "]" owner의 출력형식 
	 * */
	@Override
	public String toString() {
		return "[IDCard:" + owner + "]";
	}
	
	/**
	 * owner의 getter 메소드
	 * 해당하는 owner의 값을 가져오기 위해 사용
	 * @return owner 등록된 명명 
	 * */
	public String getOwner() {
		return owner;
	}
	
}
