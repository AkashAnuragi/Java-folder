class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // If current string is shorter or mismatch occurs
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0]; // Entire first string is the common prefix
    }

    public static void main(String[] args) {
        String strs[] = {"Akash","Akhil", "Akersh","Akansha"};
        System.out.println(longestCommonPrefix(strs));
    }
}
