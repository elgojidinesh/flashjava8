package impworks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo extends pallelstream{
	public Demo(String word, int numbers) {
		super(word, numbers);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		List<pallelstream>findno=Arrays.asList(
new pallelstream("a",1),
new pallelstream("b",2),
new pallelstream("c",3),
new pallelstream("d",4),
new pallelstream("e",5),
new pallelstream("f",6));
		
	findno.parallelStream().filter(s->s.getNumbers()>=n)
	.limit(1)
	.forEach(wod->System.out.println("this is the latteryou want "+wod.getWord()+"="+wod.getNumbers()));
				
				
				
	}
}



