import java.util.ArrayList;

public class PrimeNumbers {
	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for(int divisor = 2; n > 1; divisor++){
			while(n % divisor == 0){
				ret.add(divisor);
				n /= divisor;
			}
		}
		
		return ret;
	}
	
	public static ArrayList<Integer> primesLessThan(int n)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for(int primes = 2; primes < n; primes++){
			// if primes is a prime number
			if(generatePrimes(primes).get(0) == primes){
				ret.add(primes);
			}
		}
			
		return ret;
	}
}
