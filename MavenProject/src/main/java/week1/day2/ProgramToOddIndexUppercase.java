package week1.day2;

import java.io.IOException;
import java.util.Scanner;

public class ProgramToOddIndexUppercase {
		
		public static void main(String args[])throws IOException
		{
			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter a String : ");
			String s=scn.next(); 	// if it is a word, else in.nextLine()
			String word="";
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);	// taking the characters
				if(i%2==0)			// position alteration
				ch=Character.toUpperCase(ch);
				word=word+ch;	// making the new word
			}
			System.out.println("Required String : "+word);
		}	// close of main method
	} // close of class Alt	


