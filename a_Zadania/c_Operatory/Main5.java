
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);	// 2 => zmienna "a" zwiększona o 1 i następnie wyświetlona
		System.out.println(a++);	// 2 => zmienna "a" wyświetlona i następnie zwiększona o 1
		System.out.println(a);		// 3 => aktualna wartość zmiennej "a"
		b=a++;						// zmienna "b" zainicjowana jako zmienna "a", która następnie jest zwiększona o 1
		System.out.println(b);		// 3 => akualna wartość zmiennej "b"
		b=++a;						// zmienna "b" przyjmuje wartość 1 + 4 (zmienna "a" po tym kroku ma wartość 5)
		System.out.println(++a);	// 6 => zmienna "a" powiększona o 1 i następnie wyświetlona
	}

}
