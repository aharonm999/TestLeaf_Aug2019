package homeWork;

import java.util.ArrayList;
import java.util.List;

public class SortGivenNamesInReverseOrder {

	public static void main(String[] args) {
		
		// Sort the given company in reverse order (HCL, CTS, Aspire Systems)
		
		List<String> names = new ArrayList<String>();
		names.add("HCL");
		names.add("CTS");
		names.add("Aspire Systems");
		
		for(int i=names.size()-1; i>=0; i--) {
			System.out.println(names.get(i));
		}

	}

}
