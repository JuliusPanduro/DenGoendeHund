import java.util.Scanner;

/**
 * Skriv en metode, der tager imod en sætning af ord med mellemrum imellem. Sætningen ændres efter følgende regler:
 * • Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
 * • Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
 * • Ord på max. 3 bogstaver skal skrives med småt.

 * @author Carsten
 * Time: 10.56
 * Date: 07/02/2021
 */
public class ProperCase {

    private Scanner scanner = new Scanner(System.in);

    public void properCase(){
        String[] stringArray = userInput();
        String[] fixedStringArray = changeUserInput(stringArray);
        printStringArray(fixedStringArray);
    }

    private String[] userInput(){
        return scanner.nextLine().split(" ");
    }

    private String[] changeUserInput(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {

            if (!isUpperCase(stringArray[i])){

                if (stringArray[i].length() > 3){
                    stringArray[i] = capitalizeFirstLetter(stringArray[i]);
                }
                else{
                    stringArray[i] = stringArray[i].toLowerCase();
                }
            }
        }
        return stringArray;
    }

    private boolean isUpperCase(String str){
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    private String capitalizeFirstLetter(String str){
        str = str.toLowerCase();
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private void printStringArray(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);

            if (stringArray.length-1 != i){
                System.out.print(" ");
            }
        }
    }
}
