import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class StringCalculatorTest {

	private StringCalculator s;
	
	@BeforeTest
	public void declare()
	{
		s=new StringCalculator();
	}
	
	public void emptyString() throws Exception
	{
	assertEquals(s.add(""), 0);
	}
	public void singleValueReturn() throws Exception
	{
	assertEquals(s.add("1"), 1);
	}
	
	public void commaDelimitedSum() throws Exception
	{
		assertEquals(s.add("1,2"), 3);
	}
	
	public void newLineDelimeterReturnsSum() throws Exception
	{
		assertEquals(s.add("1\n2"), 3);
	}
	
	public void sumOfUnknownAmountOfNumbers() throws Exception
	{
		assertEquals(s.add("1,2,3,4"),10);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void negativeInputThrowsException() throws Exception
	{
		s.add("-1");
	}
	
	@Test(expectedExceptions=Exception.class)
	public void multipleNegativeInputException() throws Exception
	{
		s.add("-1,-2");
	}
	
}

