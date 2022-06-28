package impworks;

import java.util.Arrays;

public class findthemax {
	static int max ;

//
//		public boolean test() {
//		Integer arr[]= {50,40,20,30,10};
////		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			while(a[i]>max) {
//				max=a[i];
//		Arrays.sort(a,(b,c)->{
//			
////			int max=a[0];
////			System.out.println(max);
////			for(int i=1;i<a.length;i++) {
////				while(a[i]>max) {
////					max=a[i];
//			System.out.println(max);
//		
//			return 50;
//		
//		
//			});
//		return true;}
//		}
//		return false;}
//			
//			public static void main(String[] args) {
//				findthemax as=new findthemax();
//				as.test();
//				System.out.println(max);
//			}
//		}
		public static void test1() {
			Integer[]arr= {10,20,80,90,50};
			Arrays.sort(arr,(a,b)->{
				return 50;
			});
			int n=arr.length;
			for(int i=1;i<n;i++) {
				while(arr[i]>max) {
	max=arr[i];
			}
		}
		}
		public static void main(String[] args) {
			findthemax as=new findthemax();
			as.test1();
			System.out.println(max);		
		}
}
		
