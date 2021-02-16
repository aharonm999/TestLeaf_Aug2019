package week1.day1;

public class ProgramCalcCall {

	public static void main(String[] args) {
		
		int c=30;
		int d=40;
		
		ProgramCalc	calc = new ProgramCalc();
		
		System.out.println(calc.addition());
		System.out.println(calc.subtraction());
		System.out.println(calc.multiplication());
		System.out.println(calc.division());
		System.out.println(c+d);

	}

}
