import java.util.Scanner;
public class APLab_08Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = kb.nextLine();
		replace(sentence);
		
	}
	
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") < 0 )
		{
			System.out.println(sentence);
		}
		else{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1);
			replace(sentence);
		}
		return "";
		}
	
		
		
		
	}
	
	
	
