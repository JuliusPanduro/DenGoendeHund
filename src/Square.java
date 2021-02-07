/**
 * Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
 * • Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen.
 *
 * @author Carsten
 * Time: -
 * Date: -
 */
public class Square {
    
    public void printSquare(int nums){
        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < nums; j++) {
                System.out.print(" * ");
            }
            if(i != nums-1) {
                System.out.println();
            }
        }
    }

    public void printSquareWithChar(int nums, char ch){
        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < nums; j++) {
                System.out.print(" " + ch + " ");
            }
            if(i != nums-1) {
                System.out.println();
            }
        }
    }

            
}
