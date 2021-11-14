package Constructor;

public class 사람 {
	
	int age;
	String name;
	String character;
	
	public 사람(int age, String name, String character){
		this.age = age;
		this.name = name;
		this.character = character;
		
		System.out.println("안녕하세요"+age+"살"+ name +"성격은"+character+"입니다.");
	}
	
	void 자기소개() {
	    System.out.println("안녕하세요"+age+"살"+ name +"입니다.");
	  }
	void 자기소개2(int age, String name, String character) {
	    System.out.println("안녕하세요"+age+"살"+ name +"성격은"+character+"입니다.");
	  }
}
