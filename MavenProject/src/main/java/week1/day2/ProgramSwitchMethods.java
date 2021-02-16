package week1.day2;

public class ProgramSwitchMethods {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int option = 1;
		ProgramSwitchMethods task = new ProgramSwitchMethods();
	
		switch(option) {
		case 1:
			System.out.println(task.addition(num1, num2));
			break;
	
		case 2:
			System.out.println(task.subtraction(num1, num2));
			break;
			
		case 3:
		System.out.println(task.multiplication(num1, num2));
			break;
			
		case 4:
		System.out.println(task.division(num1, num2));
		
		default:
			System.out.println(task.modulo(num1, num2));
		
	}
	}		

	public int addition(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtraction(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	public int division(int num1, int num2) {
		return num1/num2;
	}
	
	public int modulo(int num1, int num2) {
		return num1%num2;
	}
}
