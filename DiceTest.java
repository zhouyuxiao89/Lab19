
public class DiceTest {
  
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
         //we cannot override the static method,
         //the compiler will generate error.
         TripleDice dice1 = new TripleDice();
         dice1.RollDice1(2,2);
         dice1.RollDice1(2,2);
         //Test triple dice roll times
         System.out.printf("The times the dice1 rolled for public method is %d\n\n",dice1.RollCount1());
         dice1.Reset();
         //Test triple dice roll times after using Reset method
         System.out.printf("The times the dice1 rolled for public method is %d\n\n",dice1.RollCount1());
    }
}
