package ułamki;

import org.junit.Test;
import witalisdomitrzułamki.Ułamek;
import static org.junit.Assert.*;
import static witalisdomitrzułamki.Utils.*;		// Używam *, bo testuję wszystkie metody z Utils
/**
 *
 * @author witek
 */
public class UtilsTest {
	
	public UtilsTest() {
	}

	/**
	 * Test of nwd method, of class Utils.
	 */
	@Test
	public void testNwd() { // Jest to funkcja obliczająca największy wspólny dzielnik dwóch liczb nieujemnych z założeniem, że nwd(0,0)=0
		System.out.println("nwd");
		int instance;
		int instance2;
		int expResult;
		int result;
		
		instance = 2;	// Test podstawowy nwd(2,3) = 1
		instance2 = 3;
		expResult = 1;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
		
		instance = 532212;	// Test nwd(532212,652314) = 6
		instance2 = 652314;
		expResult = 6;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
		
		instance = 179745;	// Test nwd(179745,69814) = 521
		instance2 = 69814;
		expResult = 521;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
		
		instance = 1000009;	// Test nwd(1000009,12000000108) = 1000009
		instance2 = 12000108;
		expResult = 1000009;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
		
		instance = 13;	// Test nwd(13,123456) = 1
		instance2 = 123456;
		expResult = 1;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);		
		
		instance = 91234;	// Test z jedynką nwd(91234,1) = 1
		instance2 = 1;
		expResult = 1;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);

		instance = 1;	// Test z jedynką nwd(1,79695) = 1
		instance2 = 79695;
		expResult = 1;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);

		instance = 0;	// Test z zerem nwd(0,4245) = 4245
		instance2 = 4245;
		expResult = 4245;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
		
		instance = 3234;	// Test podstawowy nwd(3234,0) = 4245
		instance2 = 0;
		expResult = 3234;
		result = nwd(instance, instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of ułamek method, of class Utils.
	 */
	@Test
	public void testUłamek() {
		System.out.println("ułamek");

		Ułamek expResult;
		Ułamek result;

		// Test podstawowy	2/3 = 2/3
		expResult = new Ułamek(2, 3);
		result = ułamek(2, 3);
		assertEquals(expResult, result);

		// Test na skracanie ułamków	462/385 = 6/5
		expResult = new Ułamek(462, 385);
		result = ułamek(462, 385);
		assertEquals(expResult, result);

		// Test na liczby ujemne	28/(-9) = -28/9
		expResult = new Ułamek(28, -9);
		result = ułamek(28, -9);
		assertEquals(expResult, result);

		// Test na liczby ujemne	(-13)/17 = -13/17
		expResult = new Ułamek(-13, 17);
		result = ułamek(-13, 17);
		assertEquals(expResult, result);

		// Test na liczby ujemne	(-15)/(-22) = 15/22
		expResult = new Ułamek(-15, -22);
		result = ułamek(-15, -22);
		assertEquals(expResult, result);

		// Test na złożone liczby ujemne	238/(-350) = -17/25
		expResult = new Ułamek(238, -350);
		result = ułamek(238, -350);
		assertEquals(expResult, result);

		// Test na złożone liczby ujemne	(-532)/36 = -133/9
		expResult = new Ułamek(-532, 36);
		result = ułamek(-532, 36);
		assertEquals(expResult, result);

		// Test na złożone liczby ujemne	(-56)/(-48) = 7/6
		expResult = new Ułamek(-56, -48);
		result = ułamek(-56, -48);
		assertEquals(expResult, result);

		// Test na dzielenie przez 0
		expResult = new Ułamek(1432, 0);
		result = ułamek(1432, 0);
		assertEquals(expResult, result);

		// Test na dzielenie przez 0 liczby ujemnej
		expResult = new Ułamek(-234, 0);
		result = ułamek(-234, 0);
		assertEquals(expResult, result);

		// Test na zero 0/(-32) = 0/1
		expResult = new Ułamek(0, -32);
		result = ułamek(0, -32);
		assertEquals(expResult, result);
		
		// Test na zero (-0)/2 = 0/1
		expResult = new Ułamek(-0, 2);
		result = ułamek(-0, 2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of dodaj method, of class Utils.
	 */
	@Test
	public void testDodaj() {
// Z poprzednich testów wiem już, że klasa Ułamek dobrze obsługuje liczby ujemne i skracanie. (ab/cb = a/c, (-a)/c = a/(-c) = -a/c, (-a)/(-c) = a/c)
		System.out.println("dodaj");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = ułamek(2, 7);	// Test podstawowy 2/7 + 3/7 = 5/7
		instance2 = ułamek(3, 7);
		expResult = ułamek(5, 7);
		result = dodaj(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(116, 32);	// Test złożony 116/32 + 64/51 = 1991/408
		instance2 = ułamek(64, 51);
		expResult = ułamek(1991, 408);
		result = dodaj(instance,instance2);
		assertEquals(expResult, result);

		instance = ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi (-321)/5434 + 123/533 = 933/5434
		instance2 = ułamek(123, 533);
		expResult = ułamek(933, 5434);
		result = dodaj(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(-575, 758);	// Test złożony z liczbami ujemnymi (-575)/758 + 479/(-284) = -263191/107636
		instance2 = ułamek(479, -284);
		expResult = ułamek(-263191, 107636);
		result = dodaj(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(0, 1092);	// Test złożony z zerem 0/1092 + (-72)/(-33) = 24/11
		instance2 = ułamek(-72, -33);
		expResult = ułamek(24, 11);
		result = dodaj(instance,instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of odejmij method, of class Utils.
	 */
	@Test
	public void testOdejmij() {
		System.out.println("odejmij");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = ułamek(2, 7);	// Test podstawowy 2/7 - 3/7 = -1/7
		instance2 = ułamek(3, 7);
		expResult = ułamek(-1, 7);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(116, 32);	// Test złożony 116/32 - 64/51 = 967/408
		instance2 = ułamek(64, 51);
		expResult = ułamek(967, 408);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);

		instance = ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi (-321)/5434 - 123/533 = -1575/5434
		instance2 = ułamek(123, 533);
		expResult = ułamek(-1575, 5434);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(-575, 758);	// Test złożony z liczbami ujemnymi (-575)/758 - 479/(-284) = 99891/107636
		instance2 = ułamek(479, -284);
		expResult = ułamek(99891, 107636);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(0, 1092);	// Test złożony z zerem 0/1092 - (-72)/(-33) = -24/11
		instance2 = ułamek(-72, -33);
		expResult = ułamek(-24, 11);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(234, -52438);	// Test złożony z zerem 234/(-52438) - (-0)/(-42) = -117/26219
		instance2 = ułamek(-0, -42);
		expResult = ułamek(-117, 26219);
		result = odejmij(instance,instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of pomnóż method, of class Utils.
	 */
	@Test
	public void testPomnóż() {
		System.out.println("pomnóż");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = ułamek(2, 7);	// Test podstawowy (2/7) * (3/7) = 6/49
		instance2 = ułamek(3, 7);
		expResult = ułamek(6, 49);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(116, 32);	// Test złożony (116/32) * (64/51) = 232/51
		instance2 = ułamek(64, 51);
		expResult = ułamek(232, 51);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);

		instance = ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi ((-321)/5434) * (123/533) = 963/70642
		instance2 = ułamek(123, 533);
		expResult = ułamek(-963, 70642);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(-575, 758);	// Test złożony z liczbami ujemnymi ((-575)/758) * (479/(-284)) = 275425/215272
		instance2 = ułamek(479, -284);
		expResult = ułamek(275425, 215272);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(0, 1092);	// Test złożony z zerem (0/1092) * ((-72)/(-33)) = 0/1
		instance2 = ułamek(-72, -33);
		expResult = ułamek(0, 1);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(234, -52438);	// Test złożony z zerem (234/(-52438)) * ((-0)/(-42)) = 0/1
		instance2 = ułamek(-0, -42);
		expResult = ułamek(0, 1);
		result = pomnóż(instance,instance2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of podziel method, of class Utils.
	 */
	@Test
		public void testPodziel() {
		System.out.println("podziel");
		Ułamek instance;
		Ułamek instance2;
		Ułamek expResult;
		Ułamek result;

		instance = ułamek(2, 7);	// Test podstawowy (2/7) / (3/7) = 2/3
		instance2 = ułamek(3, 7);
		expResult = ułamek(2, 3);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(116, 32);	// Test złożony (116/32) / (64/51) = 1479/512
		instance2 = ułamek(64, 51);
		expResult = ułamek(1479, 512);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);

		instance = ułamek(-321, 5434);	// Test złożony z liczbami ujemnymi ((-321)/5434) / (123/533) = -107/418
		instance2 = ułamek(123, 533);
		expResult = ułamek(-107, 418);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(-575, 758);	// Test złożony z liczbami ujemnymi ((-575)/758) / (479/(-284)) = 81650/181541
		instance2 = ułamek(479, -284);
		expResult = ułamek(81650, 181541);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(0, 1092);	// Test złożony z zerem (0/1092) / ((-72)/(-33)) = 0/1
		instance2 = ułamek(-72, -33);
		expResult = ułamek(0, 1);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);
		
		instance = ułamek(234, -52438);	// Test złożony z zerem (234/(-52438)) / ((-0)/(-42)) = 1/0
		instance2 = ułamek(-0, -42);
		expResult = ułamek(1, 0);
		result = podziel(instance,instance2);
		assertEquals(expResult, result);
	}
	
}
