package week1.day1;

public class Programs {

	public static void main(String[] args) {
		
// Program to print multiplication table for 10 in the format of 1*10=10
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*10="+i*10);
			}
		
// Program to print sum of each number of 100		
		
		int temp = 0;
		for(int a=1;a<=100;a++) {
			temp = temp+a;
		}
		System.out.println(temp);
		
// Program to check the given number is even/odd
		
		int p = 13;
		int q = 2;
		if(p/q==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}

