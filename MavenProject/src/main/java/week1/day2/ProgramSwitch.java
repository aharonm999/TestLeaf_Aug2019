package week1.day2;

public class ProgramSwitch {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int option=1;
		
		switch(option) {
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
			default:
				System.out.println(num1/num2);
			
			
			
		}

	}

}
