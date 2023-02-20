package CodingSet3;

public class CheckPalindromeofNo {

	public static void main(String[] args) {
		int input = 5335;
		String tString = "" + input;

		int i = 0;
		int j = tString.length() - 1;

		while (i < j) {
			if (tString.charAt(i) != tString.charAt(j)) {
				System.out.println("Not Palindrome");
				return;

			}
			i += 1;
			j -= 1;

		}
		System.out.println("Is Palindrome");

	}

}
