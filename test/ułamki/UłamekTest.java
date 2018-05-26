package ułamki;

import org.junit.Test;
import witalisdomitrzułamki.Ułamek;
import static org.junit.Assert.*;

/**
 *
 * @author witek
 */
public class UłamekTest {

	public UłamekTest() {
	}

	/**
	 * Test of getLicznik method, of class Ułamek.
	 */
	@Test
	public void testGetLicznik() {
		System.out.println("getLicznik");
		Ułamek instance;
		int expResult;
		int result;

		instance = new Ułamek(2, 3);			// Test podstawowy	2/3 = 2/3
		expResult = 2;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(462, 385);		// Test na skracanie ułamków	462/385 = 6/5
		expResult = 6;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(28, -9);		// Test na liczby ujemne	28/(-9) = -28/9
		expResult = -28;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(-13, 17);		// Test na liczby ujemne	(-13)/17 = -13/17
		expResult = -13;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(-15, -22);		// Test na liczby ujemne	(-15)/(-22) = 15/22
		expResult = 22;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) = -17/25
		expResult = -17;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(-532, 36);		// Test na złożone liczby ujemne	(-532)/36 = -133/9
		expResult = -133;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(-56, -48);		// Test na złożone liczby ujemne	(-56)/(-48) = 7/6
		expResult = 7;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(1432, 0);		// Test na dzielenie przez 0
		expResult = 1;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(-234, 0);		// Test na dzielenie przez 0 liczby ujemnej
		expResult = 1;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(0, -32);		// Test na zero 0/(-32) = 0/1
		expResult = 0;
		result = instance.getLicznik();
		assertEquals(expResult, result);
		
		instance = new Ułamek(-0, 2);		// Test na zero (-0)/2 = 0/1
		expResult = 0;
		result = instance.getLicznik();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getMianownik method, of class Ułamek.
	 */
	@Test
	public void testGetMianownik() {
		System.out.println("getMianownik");
		Ułamek instance;
		int expResult;
		int result;

		instance = new Ułamek(2, 3);			// Test podstawowy	2/3 = 2/3
		expResult = 3;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(462, 385);		// Test na skracanie ułamków	462/385 = 6/5
		expResult = 5;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(28, -9);		// Test na liczby ujemne	28/(-9) = -28/9
		expResult = 9;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(-13, 17);		// Test na liczby ujemne	(-13)/17 = -13/17
		expResult = 17;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(-15, 22);		// Test na liczby ujemne	(-15)/(-22) = 15/22
		expResult = 22;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) = -17/25
		expResult = 25;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(-532, 36);		// Test na złożone liczby ujemne	(-532)/36 = -133/9
		expResult = 9;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(-56, -48);		// Test na złożone liczby ujemne	(-56)/(-48) = 7/6
		expResult = 7;
		result = instance.getLicznik();
		assertEquals(expResult, result);

		instance = new Ułamek(1432, 0);		// Test na dzielenie przez 0
		expResult = 0;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(-234, 0);		// Test na dzielenie przez 0 liczby ujemnej
		expResult = 0;
		result = instance.getMianownik();
		assertEquals(expResult, result);

		instance = new Ułamek(0, -32);		// Test na zero 0/(-32) = 0/1
		expResult = 1;
		result = instance.getMianownik();
		assertEquals(expResult, result);
		
		instance = new Ułamek(-0, 2);		// Test na zero (-0)/2 = 0/1
		expResult = 1;
		result = instance.getMianownik();
		assertEquals(expResult, result);
	}

	/**
	 * Test of equals method, of class Ułamek.
	 */
	@Test
	public void testEquals() {
		// Testuję tą metodę przed porównywaniem dwóch ułamków, bo assertEquals jej używa
		System.out.println("equals");
		Ułamek instance;
		Ułamek instance2;
		boolean expResult;
		boolean result;

		instance = new Ułamek(2, 3);			// Test podstawowy	2/3 = 2/3
		instance2 = new Ułamek(2, 3);
		expResult = true;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(2, 3);			// Test podstawowy	2/3 != 3/2
		instance2 = new Ułamek(3, 2);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(462, 385);		// Test na skracanie ułamków	462/385 = 42/35
		instance2 = new Ułamek(42, 35);
		expResult = true;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(462, 385);		// Test na skracanie ułamków	462/385 = 5323/4322
		instance2 = new Ułamek(5323, 4322);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) = (-323)/475
		instance2 = new Ułamek(-323, 475);
		expResult = true;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) != 432/234
		instance2 = new Ułamek(432, 234);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) != (-432)/(-234)
		instance2 = new Ułamek(432, 234);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) != 432/(-234)
		instance2 = new Ułamek(432, -234);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) != (-432)/234
		instance2 = new Ułamek(432, -234);
		expResult = false;
		result = instance.equals(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(0, -350);	// Test na zero	0/(-350)=0/(-234)
		instance2 = new Ułamek(0, -234);
		expResult = true;
		result = instance.equals(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(-0, 2);		// Test na zero (-0)/2 = 0/1
		instance2 = new Ułamek(0, 1);
		expResult = true;
		result = instance.equals(instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class Ułamek.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		Ułamek instance;
		String expResult;
		String result;

		instance = new Ułamek(2, 3);			// Test podstawowy	2/3 = 2/3
		expResult = "2/3";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(462, 385);		// Test na skracanie ułamków	462/385 = 6/5
		expResult = "6/5";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(28, -9);		// Test na liczby ujemne	28/(-9) = -28/9
		expResult = "-28/9";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(-13, 17);		// Test na liczby ujemne	(-13)/17 = -13/17
		expResult = "-13/17";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(-15, 22);		// Test na liczby ujemne	(-15)/(-22) = 15/22
		expResult = "-15/22";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(238, -350);	// Test na złożone liczby ujemne	238/(-350) = -17/25
		expResult = "-17/25";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(-532, 36);		// Test na złożone liczby ujemne	(-532)/36 = -133/9
		expResult = "-133/9";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(-56, -48);		// Test na złożone liczby ujemne	(-56)/(-48) = 7/6
		expResult = "7/6";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(1432, 0);		// Test na dzielenie przez 0
		expResult = "1/0";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(-234, 0);		// Test na dzielenie przez 0 liczby ujemnej
		expResult = "1/0";
		result = instance.toString();
		assertEquals(expResult, result);

		instance = new Ułamek(0, -32);		// Test na zero 0/(-32) = 0/1
		expResult = "0/1";
		result = instance.toString();
		assertEquals(expResult, result);
		
		instance = new Ułamek(-0, 2);		// Test na zero (-0)/2 = 0/1
		expResult = "0/1";
		result = instance.toString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of dodaj method, of class Ułamek.
	 */
	@Test
	public void testDodaj() {
// Z poprzednich testów wiem już, że klasa Ułamek dobrze obsługuje liczby ujemne i skracanie. (ab/cb = a/c, (-a)/c = a/(-c) = -a/c, (-a)/(-c) = a/c)
		System.out.println("dodaj");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = new Ułamek(2, 7);	// Test podstawowy 2/7 + 3/7 = 5/7
		instance2 = new Ułamek(3, 7);
		expResult = new Ułamek(5, 7);
		result = instance.dodaj(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(116, 32);	// Test złożony 116/32 + 64/51 = 1991/408
		instance2 = new Ułamek(64, 51);
		expResult = new Ułamek(1991, 408);
		result = instance.dodaj(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi (-321)/5434 + 123/533 = 933/5434
		instance2 = new Ułamek(123, 533);
		expResult = new Ułamek(933, 5434);
		result = instance.dodaj(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(-575, 758);	// Test złożony z liczbami ujemnymi (-575)/758 + 479/(-284) = -263191/107636
		instance2 = new Ułamek(479, -284);
		expResult = new Ułamek(-263191, 107636);
		result = instance.dodaj(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(0, 1092);	// Test złożony z zerem 0/1092 + (-72)/(-33) = 24/11
		instance2 = new Ułamek(-72, -33);
		expResult = new Ułamek(24, 11);
		result = instance.dodaj(instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of odejmij method, of class Ułamek.
	 */
	@Test
	public void testOdejmij() {
		System.out.println("odejmij");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = new Ułamek(2, 7);	// Test podstawowy 2/7 - 3/7 = -1/7
		instance2 = new Ułamek(3, 7);
		expResult = new Ułamek(-1, 7);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(116, 32);	// Test złożony 116/32 - 64/51 = 967/408
		instance2 = new Ułamek(64, 51);
		expResult = new Ułamek(967, 408);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi (-321)/5434 - 123/533 = -1575/5434
		instance2 = new Ułamek(123, 533);
		expResult = new Ułamek(-1575, 5434);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(-575, 758);	// Test złożony z liczbami ujemnymi (-575)/758 - 479/(-284) = 99891/107636
		instance2 = new Ułamek(479, -284);
		expResult = new Ułamek(99891, 107636);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(0, 1092);	// Test złożony z zerem 0/1092 - (-72)/(-33) = -24/11
		instance2 = new Ułamek(-72, -33);
		expResult = new Ułamek(-24, 11);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(234, -52438);	// Test złożony z zerem 234/(-52438) - (-0)/(-42) = -117/26219
		instance2 = new Ułamek(-0, -42);
		expResult = new Ułamek(-117, 26219);
		result = instance.odejmij(instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of pomnóż method, of class Ułamek.
	 */
	@Test
	public void testPomnóż() {
		System.out.println("pomnóż");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = new Ułamek(2, 7);	// Test podstawowy (2/7) * (3/7) = 6/49
		instance2 = new Ułamek(3, 7);
		expResult = new Ułamek(6, 49);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(116, 32);	// Test złożony (116/32) * (64/51) = 232/51
		instance2 = new Ułamek(64, 51);
		expResult = new Ułamek(232, 51);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi ((-321)/5434) * (123/533) = 963/70642
		instance2 = new Ułamek(123, 533);
		expResult = new Ułamek(-963, 70642);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(-575, 758);	// Test złożony z liczbami ujemnymi ((-575)/758) * (479/(-284)) = 275425/215272
		instance2 = new Ułamek(479, -284);
		expResult = new Ułamek(275425, 215272);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(0, 1092);	// Test złożony z zerem (0/1092) * ((-72)/(-33)) = 0/1
		instance2 = new Ułamek(-72, -33);
		expResult = new Ułamek(0, 1);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(234, -52438);	// Test złożony z zerem (234/(-52438)) * ((-0)/(-42)) = 0/1
		instance2 = new Ułamek(-0, -42);
		expResult = new Ułamek(0, 1);
		result = instance.pomnóż(instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of podziel method, of class Ułamek.
	 */
	@Test
	public void testPodziel() {
		System.out.println("podziel");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = new Ułamek(2, 7);	// Test podstawowy (2/7) / (3/7) = 2/3
		instance2 = new Ułamek(3, 7);
		expResult = new Ułamek(2, 3);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(116, 32);	// Test złożony (116/32) / (64/51) = 1479/512
		instance2 = new Ułamek(64, 51);
		expResult = new Ułamek(1479, 512);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);

		instance = new Ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi ((-321)/5434) / (123/533) = -107/418
		instance2 = new Ułamek(123, 533);
		expResult = new Ułamek(-107, 418);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(-575, 758);	// Test złożony z liczbami ujemnymi ((-575)/758) / (479/(-284)) = 81650/181541
		instance2 = new Ułamek(479, -284);
		expResult = new Ułamek(81650, 181541);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(0, 1092);	// Test złożony z zerem (0/1092) / ((-72)/(-33)) = 0/1
		instance2 = new Ułamek(-72, -33);
		expResult = new Ułamek(0, 1);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);
		
		instance = new Ułamek(234, -52438);	// Test złożony z zerem (234/(-52438)) / ((-0)/(-42)) = 1/0
		instance2 = new Ułamek(-0, -42);
		expResult = new Ułamek(1, 0);
		result = instance.podziel(instance2);
		assertEquals(expResult, result);
	}

}
