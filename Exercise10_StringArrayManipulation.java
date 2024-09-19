/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise10_StringArrayManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] quote = new String[] { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the",
				"key", "for", "unlocking", "our", "potential" };

		System.out.println();
		printFullQuoteToConsole(quote);
		System.out.println();
		System.out.println("The number of words in the quote: " + quote.length);
		System.out.println();
		numberOfLetters(quote);
		System.out.println();
		printCurrentSmallestWord(quote);
		System.out.println();
		printCurrentLongestWord(quote);
	
	}
	/** 
	 * This method prints the current longest word to console as well as the amount of letters it contains and its current index position.
	 * @param quote
	 */
	public static void printCurrentLongestWord(String[] quote) {
		int currentLongestWord = quote[0].length();
		String longestWord = quote[0];
		int index2 = 0;
		
		for (int i = 0 ; i < quote.length ; i ++) {
			for (int j = 0 ; j < quote[i].length(); j++)
				if (currentLongestWord < quote[i].length()) {
					currentLongestWord = quote[i].length();
					longestWord = quote[i];
					index2 = i;
				}
		}
		System.out.println("The longest word is \"" + longestWord + "\". It has " + currentLongestWord + " letters and is located at Index quote[" + index2 + "].");
	}
/**
 * This method prints the current smallest word to console as well as the amount of letters it contains and its current index position.
 * @param quote
 */
	public static void printCurrentSmallestWord(String[] quote) {
		int currentSmallestWord = quote[0].length();
		String smallestWord = quote[0];
		int index = 0;
		
		for (int i = 0; i < quote.length ; i++) {
			for (int j =0 ; j < quote[i].length(); j++)
				if (currentSmallestWord > quote[i].length()){
					currentSmallestWord = quote[i].length();
					index = i;
					smallestWord = quote[i];
			}
		}
		System.out.println("The smallest word is \"" + smallestWord + "\". It has " + currentSmallestWord + " letters and is located at Index quote[" + index + "].");
	}

	/**
	 * This method returns the number of letters in an array of Strings
	 * 
	 * @param quote - Array of Strings inputed by user
	 */
	public static void numberOfLetters(String[] quote) {
		int numberOfLetters = 0;

		for (int i = 0; i < quote.length; i++) {
			for (int j = 0; j < quote[i].length(); j++)
				numberOfLetters++;
		}
		System.out.println("The number of letters (excluding spaces) = " + numberOfLetters);
	}

	/**
	 * This method prints the full quote to console.
	 * 
	 * @param quote - User input array containing quote
	 */
	public static void printFullQuoteToConsole(String[] quote) {
		System.out.print("\"");
		for (int i = 0; i < quote.length; i++) {
			if (quote[i].equalsIgnoreCase("potential")) {
				System.out.println(quote[i] + ".\"");
				continue;
			}
			System.out.print(quote[i] + " ");
		}
	}

}
