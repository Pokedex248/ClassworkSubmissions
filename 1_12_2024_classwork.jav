/**
 * make a dice and checks a word and check a if a letter is in them and count how much letters there is
 * 
 */
public class dice_roller 
{

	public static void main(String[] args) 
	{
	
		String word1 = new String(" cnfnc ");
		char word2 = ('c');
		
		
		
		
	System.out.println( countChars(word1, word2) );
	
	int i = 1;
	while(i<=200) 
	{
		System.out.println((int)(Math.random()*17)+1);
		i++;
	}	
	}
	/**
	 * 
	 * @param word1 the word that is being checked
	 * @param word2 the letter 
	 * @return how much letters in the word 
	 */
	private static int countChars(String word1, char word2) 
	{
		
		int x = 0;
		for(int i =0; i<(word1.length()); i++)
		{
			if(word1.charAt(i) == word2)
			{
				x++;	
			}
		}
			return x;
		
	}
}
