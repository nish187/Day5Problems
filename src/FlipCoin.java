public class FlipCoin {
    public static void main(String[] args) {
        double heads=0.0;
        for(int chance=1; chance<100; chance++)
        {
            if(Math.random()<0.5){
                System.out.println("heads");

            }
            else
            {
                System.out.println("Tails");
            }
            double percentHeads = heads/10*100;

            double percentTails = (10-heads)/10*100;

            System.out.println("percentage of heads is: " +percentHeads);

            System.out.println("percentage of tails is: " +percentTails);
        }
    }
}
