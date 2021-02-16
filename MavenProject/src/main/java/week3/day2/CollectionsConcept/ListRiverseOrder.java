package week3.day2.CollectionsConcept;

import java.util.ArrayList;
import java.util.List;

public class ListRiverseOrder {

	public static void main(String[] args) {
		
		// Print names in reverse Order using "List"
		
		List<String> names = new ArrayList<String>();
		names.add("America");
		names.add("Brazil");
		names.add("Denmork");
		names.add("California");
		names.add("Egypt");
		
		for(int i=names.size()-1; i>=0; i--) {
			System.out.println(names.get(i));
		}

	}

}
