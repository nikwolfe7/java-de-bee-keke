public class ReverseStringSimple {

        public static void main(String[] args) {
		String stringToReverse = String.join(" ",args);
		System.out.println("String to reverse: " + stringToReverse);
		System.out.println("Reversed string:   " + reverseString(stringToReverse));
        }

	/**
	 * The simplest algorithm to reverse a string is to make a character array
	 * equal to the length of the string we want to reverse, and then to iterate 
	 * through the characters in the string in reverse order and insert them into
	 * the character array. 
	 */
	public static String reverseString(String str) {
		char[] charArray = new char[str.length()];
		int charIndex = 0;
		for(int i = str.length()-1; i >= 0; --i) charArray[charIndex++] = str.charAt(i);
		return new String(charArray);
	}
}

