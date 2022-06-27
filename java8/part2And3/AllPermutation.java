package part2And3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AllPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter String");
    	String str=sc.next();
    	Permutation("",str);
	}

	private static void Permutation(String pre, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(pre + " ");
		} else {
			IntStream.range(0, n).parallel().forEach(
					i -> Permutation(pre + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
		}
		}
		
	}
	

