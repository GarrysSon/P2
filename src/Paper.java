import java.util.Calendar;

//It'sa me, John.

/**
 * Project #2
 * CS 2334, Section 010
 * September 19, 2013
 * <p>
 * This class models academic papers, and offers methods to get information 
 * on a specific instance of the class.
 * <p>
 * @version 1.0
 */
public class Paper implements Comparable<Paper>, java.util.Comparator<Paper> {

	private String[] authorNames; //Array of author names
	private String title; //Title of the paper
	private String serialTitle; //Title of the serial in which the paper was published.
	private String pageNumbers; //The pages where the paper appeared in the serial.
	private Calendar date; //The date the paper was published.
	private String digitalObjectID; //The optional digital identifier for the paper.
	
	/**
	 * A constructor for the Paper class.
	 * 
	 * @param authorNames Names of the authors of the paper.
	 * @param title The title of the paper.
	 * @param serialTitle Title of the serial in which the paper was published.
	 * @param pageNumbers The pages where the paper appeared in the serial.
	 * @param date The date the paper was published.
	 * @param digitalObjectID The optional digital identifier for the paper.
	 */
	public Paper(String[] authorNames, String title, String serialTitle,
				 String pageNumbers, Calendar date, String digitalObjectID) {
		
		this.authorNames = authorNames;
		this.title = title;
		this.serialTitle = serialTitle;
		this.pageNumbers = pageNumbers;
		this.date = date;
		this.digitalObjectID = digitalObjectID;
	}
	
	/**
	 * Gets the names of the paper's authors.
	 * @return The value of the authorNames field.
	 */
	public String[] getAuthorNames() {
		
		return authorNames;
	}
	
	/**
	 * Gets the title of the paper.
	 * @return The value of the title field.
	 */	
	public String getTitle() {
		
		return title;
	}
	/**
	 * Gets the title of the serial in which the paper was published.
	 * @return The value of the serialTitle field;
	 */	
	public String getSerialTitle() {
		
		return serialTitle;
	}
	/**
	 * Gets the page numbers where the paper appeared in the serial.
	 * @return The value of the pageNumbers field;
	 */	
	public String getPageNumbers() {
		
		return pageNumbers;
	}
	/**
	 * Gets the date the paper was published.
	 * @return String representation of the value of the date field.
	 */	
	public String getDate() {
		
		return null;
	}
	/**
	 * Gets the digital object identifier of the paper, if it has one.
	 * @return The value of the digitalObjectID field.
	 */	
	public String getDigitalObjectID() {
		
		return digitalObjectID;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Paper paper) {
		
		return 0;
	}
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Paper paper1, Paper paper2) {
		
		return 0;
	}
}
