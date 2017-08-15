public class LongestCommonPrefix {
	/*
	 * Write a function to find the longest common prefix string amongst an
	 * array of strings.
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0 || strs == null) {
			return "";
		}

		String commonStr = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(commonStr)) {
				commonStr = commonStr.substring(0, commonStr.length() - 1);
			}
		}
		return commonStr;
	}

}