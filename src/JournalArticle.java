import java.util.Calendar;

/**
 * Project #2
 * CS 2334, Section 010
 * September 19, 2013
 * <p>
 * This class models journal articles, and offers methods to get information 
 * on a specific instance of the class.
 * <p>
 * @version 1.0
 */
public class JournalArticle extends Paper {

	private int volume; //The volume of the journal in which the article appears.
	private int issue; //The issue of the volume in which the article appears.
	
	/**
	 * A constructor for the JournalArticle class.
	 * 
	 * @param authorNames Names of the authors of the paper.
	 * @param title The title of the paper.
	 * @param serialTitle Title of the serial in which the paper was published.
	 * @param pageNumbers The pages where the paper appeared in the serial.
	 * @param date The date the paper was published.
	 * @param digitalObjectID The optional digital identifier for the paper.
	 */
	public JournalArticle(String[] authorNames, String title, String serialTitle,
				 String pageNumbers, Calendar date, String digitalObjectID) {
		
		super(authorNames, title, serialTitle, pageNumbers, date, digitalObjectID);
	}
	
	/**
	 * Gets the volume of the journal in which the article appears.
	 * @return The value of the volume field.
	 */
	public int getVolume() {
		
		return 0;
	}
	
	/**
	 * Gets the issue of the volume in which the article appears.
	 * @return The value of the issue field.
	 */
	public int getIssue() {
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		return null;
	}
}
