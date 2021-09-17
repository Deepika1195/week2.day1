package week2.day1;

public class StringPalindrome {
	
	public static void main (String[] args) {
		
		//Declare A String value as"madam"
		String str = "madam";
		//Declare another String rev value as ""
		String rev = "";
		//Iterate over the String in reverse order
		 for (int i=str.length()-1;i>=0;i--) {
			 //Add the char into rev
			 rev=rev+str.charAt(i);
			 System.out.println(rev);
		 }
		 //Compare the original String with the reversed String, if it is same then print palinDrome 
		 if(rev.equals(str))
		 {
				System.out.println("The "+str+ " is palindrome");
			 }
			 else
			{
				System.out.println("The "+str+ " not a palindrom");
			}
		

}
}