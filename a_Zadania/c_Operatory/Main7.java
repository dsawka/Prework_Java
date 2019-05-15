
public class Main7 {

	public static void main(String[] args) {

		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result);
		nr1 = 10;					// wartość zmiennej "nr1" została zmieniona
		result = nr1 + nr2;			// dlatego wynik result będzie się różnił od poprzedniego
		System.out.println(result);

	}

}
