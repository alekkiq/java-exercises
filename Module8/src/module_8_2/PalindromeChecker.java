package module_8_2;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        String lowered = str.toLowerCase();
        String fStr = lowered.replaceAll("[^a-z0-9]", "");
        String rStr = new StringBuilder(fStr).reverse().toString();

        return rStr.equals(fStr);
    }
}
