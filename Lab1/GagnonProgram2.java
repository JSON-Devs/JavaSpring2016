import java.util.*;

public class GagnonProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//Declare Variables
		String lineOfText;
		String firstWord;
		String restOfText;
		String firstCharOfNew;
		int spacePosition;
		
		//Output line asking them to enter a sentence
		System.out.println("Enter a line of text. No punctuation please.");
		//Get the whole line
		lineOfText = keyboard.nextLine();
		//Get the position of the first space
		spacePosition = lineOfText.indexOf(" ");
		//Get the first word
		firstWord = lineOfText.substring(0, spacePosition);
		//Get the rest of the text
		restOfText = lineOfText.substring(spacePosition + 1);
		//Get the first char of the new sentence
		firstCharOfNew = lineOfText.substring(spacePosition+ 1, spacePosition + 2);
		//Set that char to upperCase
		firstCharOfNew = firstCharOfNew.toUpperCase();
		//Remove that first char from the sentence
		restOfText = restOfText.substring(1, restOfText.length());
		
		//Create a string buffer
		StringBuffer strBuf = new StringBuffer(); 
		//Append all of the strings together
		strBuf.append(firstCharOfNew); 
		strBuf.append(restOfText);
		strBuf.append(' ');
		strBuf.append(firstWord);

		//Display the new sentence
		System.out.println("I have rephrased that line to read:");
		System.out.println(strBuf.toString());
		
		keyboard.close();
	}

}
