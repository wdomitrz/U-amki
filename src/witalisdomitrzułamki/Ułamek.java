package witalisdomitrzułamki;

import static java.lang.Math.abs;

/**
 *
 * @author witek
 */
public class Ułamek {
/*
 * Ułamki trzymam w postaci skróconej.
 * Występują dwie możliwości:
 *	- Licznik jest pewną liczbą całkowitą (może być dodatni, ujemny, lub 0) i mianownik jest liczbą dodatnią
 * 	- Licznik jest równy 1, a mianownik jest równy 0 - jest to wynik dowolnego dzielenia przez 0.
 */
	private int licznik;
	private int mianownik;

	public Ułamek(int licznik, int mianownik) {
		if (mianownik == 0) {
			this.licznik = 1;
			this.mianownik = 0;
		}
		else{
			int nwdWartość = Utils.nwd(abs(licznik), abs(mianownik));
			if (mianownik < 0) {
				nwdWartość *= -1;
			}
			this.licznik = licznik / nwdWartość;
			this.mianownik = mianownik / nwdWartość;
		}
	}

	public int getLicznik() {
		return licznik;
	}

	public int getMianownik() {
		return mianownik;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Ułamek other = (Ułamek) obj;
		if (this.getLicznik() != other.getLicznik()) {
			return false;
		}
		if (this.getMianownik() != other.getMianownik()) { // if jest tu dla większej cztelości kodu
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return licznik + "/" + mianownik;
	}

	public Ułamek dodaj(Ułamek drugi) {
		return new Ułamek(this.licznik * drugi.mianownik + drugi.licznik * this.mianownik, this.mianownik * drugi.mianownik);
	}

	public Ułamek odejmij(Ułamek drugi) {
		return new Ułamek(this.licznik * drugi.mianownik - drugi.licznik * this.mianownik, this.mianownik * drugi.mianownik);
	}

	public Ułamek pomnóż(Ułamek drugi) {
		return new Ułamek(this.licznik * drugi.licznik, this.mianownik * drugi.mianownik);
	}

	public Ułamek podziel(Ułamek drugi) {
		return new Ułamek(this.licznik * drugi.mianownik, this.mianownik * drugi.licznik);
	}
}
