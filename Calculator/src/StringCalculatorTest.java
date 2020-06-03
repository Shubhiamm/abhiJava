import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public class StringCalculatorTest {

	public void emptyString()
	{
	StringCalculator s=new StringCalculator();
	assertEquals(s.add(""), 0);
	}
}
