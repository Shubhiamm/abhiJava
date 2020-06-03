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
	
	public void emptyString()
	{
	assertEquals(s.add(""), 0);
	}
	public void singleValueReturn()
	{
	assertEquals(s.add("1"), 1);
	}
}

