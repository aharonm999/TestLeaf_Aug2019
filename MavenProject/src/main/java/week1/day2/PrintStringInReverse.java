package week1.day2;

public class PrintStringInReverse {

	public static void main(String[] args) {
		
		// Program to find given string in REVERSE order 
		
/*		String name = "Alexa";
		int length = name.length();
		System.out.println(length); */
		
		String name = "alexa";
		char[] charArray = name.toCharArray();
		/*for(char c: charArray) {
			System.out.println(c);
		}*/	
		int length = name.length();
		/*System.out.println(length);*/
		
		for(int i=length;i>0;i--) {
			System.out.println(charArray[i-1]);
			
		}
		}
		

	}


