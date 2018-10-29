
public class ArrayChallengesOne
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
			}
		
		static int [] numbers = {5,10,15,20,25};
				public static void challengeOne()
					{
						String [] playerName = new String [5];
						playerName[0] = "Burke";
						playerName[1] = "Liam";
						playerName[2] = "Bo";
						playerName[3] = "Dunham";
						playerName[4] = "Dan";
						System.out.println(playerName[3]);
					}
				
				public static void challengeTwo()
					{
						System.out.println(numbers[numbers.length - 1]);
					}
				public static void challengeThree()
					{	
						 
						for (int i = 0; i < numbers.length; i++)
							{
								 
								System.out.println(numbers[i]);
							}
					}
				public static void challengeFour()
				{
					double averages = 0;
					for (int i = 0; i < numbers.length; i++)
						{
							averages = averages + numbers[1];
						}
					System.out.println(averages/(numbers.length-1));
					
				}

	}
