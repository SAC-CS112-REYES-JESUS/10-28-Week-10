import java.util.Scanner;


public class DiceGame {

	
	public static void main(String[] args)
	{
	Scanner input = new Scanner (System.in);
	
		
		
		
		
		System.out.println("Welcome to the DICE GAME!!!");
		
		
		
		int quit=0;
		
		while(quit ==0){
			
			
		System.out.println("Select number of DICE to Roll (1-3)");
		int choice = input.nextInt();
		
		RandomDice method = new RandomDice(choice);

		System.out.println("Ok, take a guess of what did you roll??");
		int guess = input.nextInt();
	
		if(choice==1){
			
			
			int oneDice =method.OneDice();
			if(guess==oneDice){
				System.out.println("Congrats right number");
			}
			else
				System.out.println("Sorry");
			System.out.printf("The random dice # is: %d\n",oneDice);
			
					}
		else if(choice ==2){
			
				int twoDice =method.TwoDice();
				if(guess==twoDice){
					System.out.println("Congrats right number");
				}
				else
					System.out.println("Sorry");
				System.out.printf("The random dice # is: %d\n",twoDice);
		}

		else{ 
			int threeDice = method.ThreeDice();
					if(guess==threeDice){
						System.out.println("Congrats right number");
					}
					else
						System.out.println("Sorry");
					System.out.printf("The random dice # is: %d\n", threeDice);
			}
			
			
		System.out.println("To play press 0 or 1 to quit");
		quit=input.nextInt();
		}	
		
		System.out.println("thanks for playing");
		
		
	}


}
	
	

