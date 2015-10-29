
public class RandomNumber {

	private int lowest;
	private int highest;
		
		public int GetANumber_Between_1_and_10()
		{
			
		int random= (int) (1+Math.random() * 10) ;
		return random;
		}
		
		public int GetANumber(int high){
			
			int random = (int) (1+Math.random() * high);
			return random;	
		}
		
		public int GetANumber(int lo, int high){
			
			int random = lo+ (int) (Math.random()*((high -lo)+1));
			return random;	
			}
		
		public void setLowNumber(int low){
			lowest= low;	
		}
		
		public void setHighNumber(int high){
			highest=high;
			
		}

		/*public int GetANumber()
		
		{
			int random = lowest + (int) (Math.random()*((highest-lowest)+1));
			return random;
		}
		*/
	
		//lab5
		
		public RandomNumber(int high){
			
		highest = high;	
		}
		
		public int GetANumber()
		{
			int random = (int) (Math.random()*highest);
			return random;
			
		}

		
		
}



