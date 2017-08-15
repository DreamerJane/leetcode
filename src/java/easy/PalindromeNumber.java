public class PalindromeNumber {
	/*
	 * Determine whether an integer is a palindrome. Do this without extra space.
	 * 
	 * Some hints:
	 * Could negative integers be palindromes? (ie, -1)
	 * If you are thinking of converting the integer to string, note the restriction of using extra space.
	 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", 
	 * you know that the reversed integer might overflow. How would you handle such case?
	 * There is a more generic way of solving this problem.
	 */
	public boolean isPalindrome(int x) {
		String numStr = String.valueOf(x);
		if (numStr.charAt(0) == '-') {
			return false;
		}
		int index = 0;
		for (int i = 0; i <= numStr.length() / 2; i++) {
			if (numStr.charAt(i) == numStr.charAt(numStr.length() - 1 - i)) {
				index = i;
			} else {
				break;
			}
		}
		if (index == numStr.length() / 2) {
			return true;
		}
		return false;

	}
}
