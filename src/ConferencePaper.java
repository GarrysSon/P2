import java.util.Calendar;

/**
 * Project #2
 * CS 2334, Section 010
 * September 19, 2013
 * <p>
 * This class models conference papers, and offers methods to get information 
 * on a specific instance of the class.
 * <p>
 * @version 1.0
 */
public class ConferencePaper extends Paper {

	/**
	 * A constructor for the ConferencePaper class.
	 * 
	 * @param authorNames Names of the authors of the paper.
	 * @param title The title of the paper.
	 * @param serialTitle Title of the serial in which the paper was published.
	 * @param pageNumbers The pages where the paper appeared in the serial.
	 * @param date The date the paper was published.
	 * @param digitalObjectID The optional digital identifier for the paper.
	 */
	public ConferencePaper(String[] authorNames, String title, String serialTitle,
				 String pageNumbers, Calendar date, String digitalObjectID) {
		
		super(authorNames, title, serialTitle, pageNumbers, date, digitalObjectID);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		return null;
	}
}