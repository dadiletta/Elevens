/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		// DECK 1
		System.out.println("---- DECK ONE TESTS -----");
		String[] ranks1 = {"one", "two", "three", "queen", "king"};
		String[] suits1 = {"blue", "green", "yellow"};
		int[] points1 = {1, 2, 3, 10, 11};
		Deck one = new Deck(ranks1, suits1, points1);
		System.out.println("Deck1 isEmpty: " + one.isEmpty());
		System.out.println("Deck1 toString: ");
		System.out.println(one);
		
		// DECK 2
		System.out.println("---- DECK TWO TESTS -----");
		String[] ranks2 = {"ace", "two", "three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits2 = {"spades", "hearts", "clubs", "diamonds"};
		int[] points2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck two = new Deck(ranks2, suits2, points2);
		System.out.println("Deck2 isEmpty: " + two.isEmpty());
		System.out.println("Deck2 toString: ");
		System.out.println(two);	
		
		// DECK 3
		System.out.println("---- DECK THREE TESTS -----");
		Deck three = new Deck(ranks2, suits2, points2);
		System.out.println("Deck3 isEmpty: " + three.isEmpty());
		System.out.println("__DEALING CARDS__");
		while(!three.isEmpty()) {
			System.out.println(three.deal());
		}
		System.out.println("Deck3 isEmpty: " + three.isEmpty());	
	}
}