/**
 * UC6: Print OOPS to Console using static
 *
 * @author hk9981
 * @version 1.0
 */
public class UC6PrintOOPS {
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        };
    }
    public static void main(String[] args) {
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();
        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join("  ", O[i], O[i], P[i], S[i])
            );
        }
    }
}