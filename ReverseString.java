/**
 * This is a program to reverse a string in Java.
 * 
 * First you compile the program as follows:
 * 
 * javac ReverseString.java
 * 
 * Then, to run the program, you call the class and pass a string to reverse as
 * a parameter, like so:
 * 
 * java ReverseString reverse this string
 *
 * And the program output shall be:
 *
 * String to reverse: reverse this string
 * Reversed string:   gnirts siht esrever
 *
 **/
public class ReverseString {

	/**
         * Receive the string passed as input to the main method.
         *
         * Remember that the arguments passed to the function are separated by
         * spaces, and the JVM will assemble them into a String[] array. So,
         * by calling:
         * 
         * java ReverseString reverse this string
         *
         * the value of args in the main method will be:
         *
         * {"reverse","this","string"}
         * 
         * ...where the individual words will be the different indexes in the
         * String[] array, like so:
         *
         * args[0] --> "reverse"
         * args[1] --> "this"
         * args[2] --> "string"
         * 
         * We can use the Java String.join() function to assemble these strings 
         * together, and pass the assembled string to our reverseString()
         * method. See the code below. 
         */
        public static void main(String[] args) {
		// Read in the args parameter, and join with spaces. 
		String stringToReverse = String.join(" ",args);

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
		// Get the length of the argument string.
		int len = str.length();

		// Make a character array equal to this length
		char[] charArray = new char[len];

		// Make a pointer to the first index in charArray
		int charIndex = 0;

		/** 
		 * Iterate through the string in reverse order.
		 * 
		 * (Remember that the indexes in the array start
		 * at zero, so the last index in the array will 
		 * be index of len - 1, otherwise we will see an
		 * ArrayIndexOutOfBoundsException, and the program
		 * will crash.)
		 */ 
		for(int i = len - 1; i >= 0; i--) {
			// Get the character at index i
			char c = str.charAt(i);
			
			// Insert c into charArray at index charIndex
			charArray[charIndex] = c;

			// Increment charIndex
			charIndex += 1;
		}
		
		// Now, convert the char array to a new String()
		String reversedStr = new String(charArray);

		// Return the string. We're done!
		return reversedStr;
	}
}

