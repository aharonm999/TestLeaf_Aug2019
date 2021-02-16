package week1.day2;

public class ProgramToReverseEachWordOfString {
	
	public static void main(String[] args) {
		System.out.println(ProgramToReverseEachWordOfString.reverseWord("I am a software Tester"));
	}
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	
	
}  


