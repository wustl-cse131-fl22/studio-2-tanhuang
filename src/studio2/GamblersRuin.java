package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money are you starting with? (whole number)");
		int startAmount = in.nextInt();
		int currentAmount = startAmount;
		System.out.println("I will start with " + startAmount + " dollars");
		
		System.out.println("What's the probability for you to win today? (0 to 1)");
		double winChance = in.nextDouble();
		System.out.println("The probability is " + winChance);
		
		System.out.println("How much do you want to win before leaving?");
		int winLimit = in.nextInt();
		System.out.println("The winning limit amount is " + winLimit + " dollars");
		
		
		System.out.println("How much days of simulation do you want?");
		int totalSimulations = in.nextInt();;
		int simulationCount=0;
		int LOSE =0;
		int WIN =0;
		int count =0;
		while (simulationCount <= totalSimulations)
		{
			startAmount=currentAmount;
		
			while (startAmount>0 && startAmount<=winLimit)
			{
				
				double randomNumber = (double)Math.random();
				
				if (randomNumber <= winChance)
				{
					startAmount ++;
					count++;
				}
				else
				{
					startAmount --;
					count++;
				}
		
				
			}
				
				
			
			
			if (startAmount==0)
			{
				simulationCount ++;
				LOSE ++;
				System.out.println("Simulation "+ simulationCount +": " + count +" You lose");
			}
			else
			{
				simulationCount ++;
				WIN ++;
				System.out.println("Simulation "+ simulationCount +": " + count +" You win");
			}
			
		}
		System.out.println("Losses: " + LOSE + " Simulations: "+ simulationCount);
		
		
		

	}

}
