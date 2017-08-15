public class Reverse {
	/*
	 * Reverse digits of an integer.
	 * Example1: x = 123, return 321
	 * Example2: x = -123, return -321
	 * Note:
	 * The input is assumed to be a 32-bit signed integer.
	 * Your function should return 0 when the reversed integer overflows.
	 */
	public int reverse(int x) {
		int result = 0;
		boolean isNegative = false;
		String numStr = String.valueOf(x);
		StringBuilder numBuilder = new StringBuilder();
		if (numStr.charAt(0) == '-') {
			numStr = numStr.substring(1);
			isNegative = true;
			numBuilder.append("-");
		}
		char[] numAray = numStr.toCharArray();
		for (int i = numAray.length - 1; i >= 0; i--) {
			numBuilder.append(numAray[i]);
		}
		try {
			result = Integer.parseInt(numBuilder.toString());
		} catch (NumberFormatException e) {
			return 0;
		}

		return result;

	}
}