
public class RandomDice {

	
	
	private int number;

		public RandomDice(int num)
		{
			number =num;
			}
		
		
		
		public int OneDice()
		{
			
			int random = (int) (1+Math.random() * 6);
			return random;	
		}
		
		public int TwoDice(){
			
			int random = (int) (Math.random() * 12+2);
			return random;
		}
			
			
		
		public int ThreeDice(){
			int random = (int) ((Math.random()* 18)+2);
			return random;
			
		}
		
	}

