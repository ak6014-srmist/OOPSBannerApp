/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves modularity by storing banner lines
 * in a String array and printing them using a loop.
 *
 * @author Developer
 * @version 4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            "  *****    *****    ******    *****  ",
            " **   **  **   **  **   **  **   ** ",
            " **   **  **   **  **   **  **       ",
            " **   **  **   **  ******    *****   ",
            " **   **  **   **  **            **  ",
            " **   **  **   **  **        **   ** ",
            "  *****    *****   **         *****   "

        };

        // Print using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}