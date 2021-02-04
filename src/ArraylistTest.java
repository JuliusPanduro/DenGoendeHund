import java.util.ArrayList;

public class ArraylistTest {

    public boolean doesArraylistContainString(ArrayList<String> list, String text) {
        if (list.contains(text)) {
            return true;
        } else {
            list.add(text);
            return false;
        }
    }

}
