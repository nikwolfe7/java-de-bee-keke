/**
 * This is a program to reverse a string in Java.
 **/
public class ReverseStringTemplate {

	/*
	 * This does NOT use command line parameters. It will ignore anything passed to the args.
	 */
        public static void main(String[] args) {
		String stringToReverse = "string to reverse"; 

		// Print out the string to the screen.
		System.out.println("String to reverse: " + stringToReverse);

		// Reverse the string for the world to see. 
		System.out.println("Reversed string:   " + reverseString(stringToReverse));
        }

	/**
	 * The simplest algorithm to reverse a string is to make a character array
	 * equal to the length of the string we want to reverse, and then to iterate 
	 * through the characters in the string in reverse order and insert them into
	 * the character array. 
	 */
	public static String reverseString(String str) {

		/* write your code here */	

		return str; 
	}

}

