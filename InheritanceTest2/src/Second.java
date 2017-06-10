
public class Second extends First {
	//아무 멤버도 없는 것처럼 보이지만
	//이미 멤버 보유한 상태
	
	int b;
	
	//생성자 메소드
	public Second(){
		System.out.println("Second 생성!!");
	}
	
	void showSecond(){
		System.out.println("Second show.."+b);
	}
	
	void show(){
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
	
}
