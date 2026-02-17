/**
 * UC5: Optimized OOPS Banner using inline array initialization
 *
 * @author hk9981
 * @version 1.0
 */
public class UC5PrintBanner {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", "  ***  ", "  ***  ", " ****  ", " ***** "),
            String.join(" ", " *   * ", " *   * ", " *   * ", " *     "),
            String.join(" ", "*     *", "*     *", " ****  ", " ****  "),
            String.join(" ", "*     *", "*     *", " *     ", "     * "),
            String.join(" ", " *   * ", " *   * ", " *     ", " *   * "),
            String.join(" ", "  ***  ", "  ***  ", " *     ", " ***** "),
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
