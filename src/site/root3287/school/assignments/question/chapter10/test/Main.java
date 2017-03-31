
public class Main {
	
	public static void main(String[] args) {
		Fraction frac = new Fraction(2, 6);
		Fraction frac2 = new Fraction(1, 4);
		System.out.println(frac);
		System.out.println(frac2);
		System.out.println(frac.isGreaterThan(frac2));
	}
}
