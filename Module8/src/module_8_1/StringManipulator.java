package module_8_1;

public class StringManipulator {
    public static String concatenate(String s1, String s2) {
        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";

        return s1 + s2;
    }

    public static int findLength(String s) {
        if (s == null) return 0;

        return s.length();
    }

    public static String convertToUpperCase(String s) {
        if (s == null) return "";

        return s.toUpperCase();
    }

    public static String convertToLowerCase(String s) {
        if (s == null) return "";

        return s.toLowerCase();
    }

    public static boolean containsSubstring(String s, String subS) {
        if (s == null || subS == null) return false;

        return s.contains(subS);
    }
}
