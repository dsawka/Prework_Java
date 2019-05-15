
public class Main8 {

	public static void main(String[] args) {

		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white;
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite && goodOrBad;
		System.out.println(blackOrWhite);	// 16 < 15 => false
		System.out.println(goodOrBad);		// prawda jeżeli chociaż jedna ze stron jest prawdą => true
		System.out.println(comparison);		// prawda jeżeli obie wartości są prawdą => false
	}

}
