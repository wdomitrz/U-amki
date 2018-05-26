package witalisdomitrzułamki;

/**
 *
 * @author witek
 */
public class Utils {

	public static int nwd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return nwd(b, a % b);
	}

	public static Ułamek ułamek(int l, int m) {
		return new Ułamek(l, m);
	}

	public static Ułamek dodaj(Ułamek u1, Ułamek u2) {
		return u1.dodaj(u2);
	}

	public static Ułamek odejmij(Ułamek u1, Ułamek u2) {
		return u1.odejmij(u2);
	}

	public static Ułamek pomnóż(Ułamek u1, Ułamek u2) {
		return u1.pomnóż(u2);
	}

	public static Ułamek podziel(Ułamek u1, Ułamek u2) {
		return u1.podziel(u2);
	}
}
