package homeWork;

import java.util.Scanner;

public class PrintUniqueCharacterInTheString {

	public static void main(String[] args) {
		
		/*2)	Print only the Unique character in the String  "PayPal India"
		IP: PayPal India
		OP: ylnd      */
		
		Scanner kb = new Scanner(System.in); 
	     String word = "";

	     System.out.println("Enter a word: ");
	     word = kb.nextLine();

	     uniqueCharacters(word); 
	}

	    public static void uniqueCharacters(String test){
	      String temp = "";
	         for (int i = 0; i < test.length(); i++){
	            if (temp.indexOf(test.charAt(i)) == - 1){
	               temp = temp + test.charAt(i);
	         }
	      }

	    System.out.println(temp + " ");
	
		}

	}

