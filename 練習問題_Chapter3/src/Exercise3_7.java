
public class Exercise3_7 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float calcius = (int)((5.0f / 9.0f * (fahrenheit - 32))*100+0.5)/100f;
		//소수점 세쨰자리에서 반올림
		
		System.out.println("Fahrenheit :" + fahrenheit);
		System.out.println("Calcius : " + calcius);
	}

}
