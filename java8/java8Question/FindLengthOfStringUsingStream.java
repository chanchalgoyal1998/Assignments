package java8Question;

public class FindLengthOfStringUsingStream {

	public static void main(String[] args) {
		String str="Hello";
		long len=str.chars().count();
		System.out.println("length of stream "+len);
		
		
	}
}
