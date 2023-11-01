package project;
import java.util.Scanner;
public class wordcounter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		System.out.println("Enter a word");
		String word = sc.nextLine();
		str += " ";
		String word1="";
		int count =0;
		int len =str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i) == ' ')
			{
				if(word1.equalsIgnoreCase(word1))
					count++;
				word = "";
			}
			else
			{
				word += str.charAt(i);
			}
			}
		if(count >0)
		{
			System.out.println(word + "is present"+count+"times.");
		}
		else
		{
			System.out.println(word +"is not presemt in sentence.");
		}
	}
		// TODO Auto-generated method stub

	}


