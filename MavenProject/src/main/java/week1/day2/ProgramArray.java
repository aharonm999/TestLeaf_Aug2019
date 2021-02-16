package week1.day2;

public class ProgramArray {

	public static void main(String[] args) {
		
		String[] employees = {"Alex", "Benz", "Cathee", "Desouza", "Ellen"};
		
		int length=employees.length;
		
// using for loop		
		
		for(int i=0;i<length;i++) {
			System.out.println(employees[i]);
		}
		
// using for each - [ we will use in collections ]
		
		for(String emp: employees) {
			System.out.println(emp);
			
		}
	}

}
