class Am{
	public void callMe(){
		System.out.println("클래스 Am의 callme() 메서드 실행");
	}
}

class Bm extends Am{
	@Override
	public void callMe(){
		System.out.println("클래스 Bm의 callMe() 메서드 실행");
	}
}

class Cm extends Am {
	@Override
	public void callMe(){
		System.out.println("클래스 CM의 callMe() 메서드 실행");
	}
}


public class PolymorphismTest1 {
	public static void main(String[] args) {
		Am r = new Am();
		r.callMe();
		r = new Bm();
		r.callMe();
		r = new Cm();
		r.callMe();
		
	}
}
