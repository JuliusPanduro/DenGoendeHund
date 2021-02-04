public class Grass {
// Anton

    private final double grassGrowth = 0.8;

    public void CutGrassDeadline (double currentLength, double maxLength){

        double deadline = (maxLength-currentLength)/grassGrowth;

        System.out.println("You must cut the grass within " + deadline + " days, or it will succeed your max length, " + maxLength + " cm");

    }



}
