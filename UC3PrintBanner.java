/**
 * UC3: Print OOPS in Banner Format using String.join()
 *
 * @author hk9981
 * @version 1.0
 */
public class UC3PrintBanner {

    public static void main(String[] args) {

        // OOPS Banner using String.join() (UC3)
        System.out.println(String.join(" ", "  ***  ", "  ***  ", " ****  ", " ***** "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *   * ", " *     "));
        System.out.println(String.join(" ", "*     *", "*     *", " ****  ", " ****  "));
        System.out.println(String.join(" ", "*     *", "*     *", " *     ", "     * "));
        System.out.println(String.join(" ", " *   * ", " *   * ", " *     ", " *   * "));
        System.out.println(String.join(" ", "  ***  ", "  ***  ", " *     ", " ***** "));
    }
}
