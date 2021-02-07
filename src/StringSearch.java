import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Skriv en metode, der som parametre modtager et array af typen String samt en String.
 * Metoden skal undersøge om strengen findes i arrayet.
 * Metoden skal returnere indekspositionen, hvis strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.
 * • Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.
 *
 * @author Carsten
 * Time: -
 * Date: -
 */
public class StringSearch {

    public int stringSearchInStringArray(String[] list, String str){

        return Arrays.asList(list).indexOf(str);
    }

    public int stringSearchInStringArrayWithException(String[] list, String str){

        if(!Arrays.asList(list).contains(str)){
            throw new NoSuchElementException();
        }
        return Arrays.asList(list).indexOf(str);
    }
}
