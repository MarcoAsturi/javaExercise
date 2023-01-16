// Write a program Huntingtons.java to analyze a DNA string for Huntington’s disease
// and produce a diagnosis
// The gene that causes Huntington’s disease is located on chromosome 4
// and has a variable number of (consecutive) repeats of the CAG trinucleotide.
// The normal range of CAG repeats is between 10 and 35.
// Individuals with Huntington’s disease have between 36 and 180 repeats

public class W8E1Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int rep = 0;
        int count = 0;
        for (int i = 0; i < dna.length(); i += 3) {
            if (dna.substring(i, i + 3).equals("CAG")) {
                count++;
                if (count > rep) {
                    rep = count;
                }
            } else {
                count = 0;
            }
        }
        return rep;
    }

    // OPTIONAL
    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        return s.replaceAll(" ", "");
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    // repeats diagnosis
    // 0–9 not human
    // 10–35 normal
    // 36–39 high risk
    // 40–180 Huntington’s
    // 181– not human

    public static String diagnose(int maxRepeats) {
        if (maxRepeats >= 10 && maxRepeats < 36)
            return "normal";
        else if (maxRepeats >= 36 && maxRepeats < 40)
            return "high risk";
        else if (maxRepeats >= 40 && maxRepeats < 181)
            return "Huntington's";
        else
            return "not human";
    }

    // Print a medical diagnosis
    public static void main(String[] args) {
        String s1 = "TTTCAGCAGCAG TTTCAGCAG CAGCAGTTT";
        String s2 = "CAGCAGCAGTTT";
        String s3 = "CAGTTTCAGCAG";
        // s4 -> 64 reps -> Huntington's
        String s4 =
                "TTTT TTCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGCAGCAG CAGCAGCAGC AGCAGCAGCAGCAGTTT";
        // s5 -> 13 reps -> normal
        String s5 = "TTTTTTTTT CAGCAGCAG CAGCAGCAG CAGCAGCAG CAGCAGCAG CAGTTTTTT";
        System.out.println(maxRepeats(removeWhitespace(s1)));
        System.out.println(diagnose(maxRepeats(removeWhitespace(s1))));
        System.out.println(maxRepeats(removeWhitespace(s2)));
        System.out.println(diagnose(maxRepeats(removeWhitespace(s2))));
        System.out.println(maxRepeats(removeWhitespace(s3)));
        System.out.println(diagnose(maxRepeats(removeWhitespace(s3))));
        System.out.println(maxRepeats(removeWhitespace(s4)));
        System.out.println(diagnose(maxRepeats(removeWhitespace(s4))));
        System.out.println(maxRepeats(removeWhitespace(s5)));
        System.out.println(diagnose(maxRepeats(removeWhitespace(s5))));
    }
}
