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
            
}
