
public class TripleDice extends Dice{
    private  int RollCount;
  public TripleDice()
  {
	  RollCount = 0;
  }
  public int RollDice1(int DiceNumber, int Max) {
	DiceNumber = 3;
  	int dice;
  	dice = 1 + (int) (Math.random() * Max * DiceNumber);
  	RollCount = RollCount + DiceNumber;
  	return dice;
  }
 
  public int RollCount1() {
      return RollCount;
  }
  public int Reset()
  {
	  return RollCount = 0;
  }
  
}

