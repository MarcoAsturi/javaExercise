// Write a program that takes a start string and a stop string as command-line arguments
// and prints all substrings of a given string that start with the first, end with the second,
// and otherwise contain neither

public class W8O2FindSubstring {

    // Finding substring
    public static String finder(String start, String end, String s) {
        int startLen = start.length();
        int endLen = end.length();
        String result = "";
        // entering in the cycle only if the string contains start and end substring
        if (s.contains(start) && s.contains(end)) {
            // scaling down s in order to find the right substring
            for (int i = 0; i < s.length(); i++) {
                String subS = s.substring(i, s.length());
                // looking for start string
                if (subS.startsWith(start)) {
                    // looking for end string
                    for (int j = startLen + 1; j < subS.length(); j++) {
                        if (subS.charAt(j) == (end.charAt(0))) {
                            // creating possible result
                            String subSubS = subS.substring(0, j + endLen);
                            if (subSubS.endsWith(end)) {
                                result = subSubS;
                                i += subSubS.length();
                            }
                        }
                    }
                }
            }
        } else {
            result = "NO SUBSTRING FOUND";
        }
        return result;
    }

    // FOR NOW IT WORKS ONLY WITH A STRING THAT CONTAINS JUST ONE SUBSTRING
    public static void main(String[] args) {
        String start = args[0];
        String end = args[1];
        String s = args[2];
        System.out.println(finder(start, end, s));

    }
}
