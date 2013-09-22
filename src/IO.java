import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project #2
 * CS 2334, Section 010
 * September 19, 2013
 * <p>
 * This class handles all of the input and output for the ScholarPub program.
 * <p>
 * @version 1.0
 */
public class IO {

	public static final int TO_SCREEN = 0; //Constant for printing to screen.
	public static final int TO_FILE   = 1; //Constant for printing to file.
	
	/**
	 * Returns the user's keyboard input as a string.
	 * 
	 * @param prompt The text with which to prompt the user. 
	 * @return The user's keyboard input.
	 */
	public static String getUserInput(String prompt) {
	
		return null;
	}
	
	/**
	 * Reads paper data out of the specified file into a List of Paper objects.
	 * 
	 * @param fileName The name of the file out of which to read the data.
	 * @return The paper data parsed into a List of Paper objects.
	 * @throws IOException 
	 */
	public static List<Paper> readFromFile(String fileName) throws IOException {
		
		FileReader fReader = new FileReader( fileName );
		BufferedReader bReader = new BufferedReader( fReader );
		
		List<Paper> tempList = new ArrayList<Paper>();
		String[] tempAuthorNames;
		String tempTitle;
		String tempSerialTitle;
		int tempVolume;
		int tempIssue;
		String tempPageNumbers;
		String tempDate;
		String tempDigitalObjectID;
		String temp = bReader.readLine();
		String[] tempArray;
		
		while( bReader.ready() )
		{
			if( temp.equals( "Conference Paper" ) )
			{
				tempAuthorNames = bReader.readLine().split( "; " );
				tempTitle = bReader.readLine();
				tempSerialTitle = bReader.readLine();
				tempPageNumbers = bReader.readLine();
				tempDate = bReader.readLine();
				
				temp = bReader.readLine();
				
				if( temp.equals( "\n" ) )
					tempDigitalObjectID = "";
				else
				{
					tempDigitalObjectID = temp;
					bReader.readLine();
				}
				
				tempList.add( new ConferencePaper( tempAuthorNames, tempTitle, tempSerialTitle, tempPageNumbers, tempDate, tempDigitalObjectID ) );
			}
			else
			{
				tempAuthorNames = bReader.readLine().split( "; " );
				tempTitle = bReader.readLine();
				tempSerialTitle = bReader.readLine();
				
				temp = bReader.readLine();
				temp = temp.replaceAll("(|);", " ");
				tempArray = temp.split(" ");
				
				tempVolume = Integer.parseInt( tempArray[0] );
				tempIssue = Integer.parseInt( tempArray[1] );
				tempPageNumbers = tempArray[2];
				tempDate = bReader.readLine();
				
				temp = bReader.readLine();
				
				if( temp.equals( "\n" ) )
					tempDigitalObjectID = "";
				else
				{
					tempDigitalObjectID = temp;
					bReader.readLine();
				}
				
				tempList.add( new JournalArticle( tempAuthorNames, tempTitle, tempSerialTitle, tempVolume, tempIssue, tempPageNumbers, tempDate, tempDigitalObjectID ) );
			}
		}
		
		bReader.close();
		
		return tempList;
	}
	
	/**
	 * Prints the List of Papers either to the console or to a 
	 * file based on the whereToPrint parameter.
	 * 
	 * @param whereToPrint Specifies to where the data should be printed.
	 * @param whatToPrint The List of Papers to print.
	 */
	public static void print(int whereToPrint, List<Paper> whatToPrint) {
		
	}
}
