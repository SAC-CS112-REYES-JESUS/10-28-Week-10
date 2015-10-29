
public class RandomNumber {

		
		public int GetANumber_Between_1_and_10()
		{
			
		int random= (int) (1+Math.random() * 10) ;
		return random;
		}
		
		public int GetANumber(int high){
			
			int random = (int) (1+Math.random() * high);
			return random;
			
		}
	}



