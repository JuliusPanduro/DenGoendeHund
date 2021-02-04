import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Julius Panduro
 */

public class Sorting {
    private ArrayList<String> sortArraylist = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void sortThis() {
        System.out.println("Enter 5 Strings");
        for (int i = 0; i < 5; i++) {
            sortArraylist.add(scanner.nextLine());
        }
        Collections.sort(sortArraylist);
        Collections.reverse(sortArraylist);
        System.out.println(sortArraylist);
    }
}
