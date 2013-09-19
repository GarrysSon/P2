import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class IOTest
{

	@Before
	public void setUp() throws Exception
	{

	}

	@Test
	public void testGetUserInput()
	{
		
		assertEquals("Test", IO.getUserInput("Please enter 'Test':"));
	}

	@Test
	public void testReadFromFile()
	{

		assertNotNull(IO.readFromFile("src/Papers.txt"));
	}

	@Test
	public void testPrint()
	{

		fail("Not yet implemented");
	}

}
