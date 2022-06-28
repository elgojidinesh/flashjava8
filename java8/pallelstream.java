package impworks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class pallelstream{
//	public static void main(String[] args) {
//		
//	Scanner sc=new Scanner(System.in);
//	long start=0;
//	long end=100;
//	for(int i=0;i<=start;i++) {
//}int arr[]= {2,1,3,5,6,7,8,9,10};
//int n=arr.length+1;
//int sum=(n*(n+1))/2;
//for(int i=0;i<arr.length;i++) {
//	sum=sum-arr[i];
//	
//}System.out.println("mising no"+sum); 
//IntStream.range(1, 100).parallel().forEach(System.out::println);
//
//
//
//}
	String word;
	int numbers;
	public pallelstream(String word, int numbers) {
		super();
		this.word = word;
		this.numbers = numbers;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	
}
