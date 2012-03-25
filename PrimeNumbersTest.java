import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumbersTest {
	@Test
	public void testJUnit()
	{
		assertTrue("Compiler does not use JUnit", true);
	}
	
	@Test
	public void testOne(){
		assertEquals(list(), PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(3), PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2, 2), PrimeNumbers.generatePrimes(4)); 
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2, 3), PrimeNumbers.generatePrimes(6));
	}
	
	@Test
	public void testEight(){
		assertEquals(list(2, 2, 2), PrimeNumbers.generatePrimes(8));
	}
	
	@Test
	public void testNine(){
		assertEquals(list(3, 3), PrimeNumbers.generatePrimes(9));
	}
	
	@Test
	public void testBigNumber(){
		assertEquals(list(5, 7, 7, 1327), PrimeNumbers.generatePrimes(325115));
	}
	
	@Test
	public void testOnePrime(){
		assertEquals(list(), PrimeNumbers.primesLessThan(1));
	}
	
	@Test
	public void testTwoPrime(){
		assertEquals(list(), PrimeNumbers.primesLessThan(2));
	}
	
	@Test
	public void testThreePrime(){
		assertEquals(list(2), PrimeNumbers.primesLessThan(3));
	}
	
	@Test
	public void testFourPrime(){
		assertEquals(list(2, 3), PrimeNumbers.primesLessThan(4));
	}
	
	@Test
	public void testFivePrime(){
		assertEquals(list(2, 3), PrimeNumbers.primesLessThan(5));
	}
	
	@Test
	public void testSixPrime(){
		assertEquals(list(2, 3, 5), PrimeNumbers.primesLessThan(6));
	}
	
	@Test
	public void testThirteenPrime(){
		assertEquals(list(2, 3, 5, 7, 11), PrimeNumbers.primesLessThan(13));
	}
	
	@Test
	public void testHundredPrime(){
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
				PrimeNumbers.primesLessThan(100));
	}
	private static ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints)
			ret.add(i);
		return ret;
	}
}
