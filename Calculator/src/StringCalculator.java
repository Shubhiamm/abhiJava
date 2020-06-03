
public class StringCalculator {

	
	private final String delimeter=",|\n";
	
	public int add(String input) throws Exception
	{
		String[] digits=input.split(delimeter);
		
		if (isEmpty(input)) {
			return 0;
		}
		
		if(input.length()==1) {
			return stringToInt(input);
		}
		else
		{
			return getAddition(digits);
		}
	}
	
	private int getAddition(String[] digits) throws Exception
	{
		exceptionalInput(digits);
		
		int sum=0;
		for(String value:digits)
		{
			sum+=stringToInt(value);
		}
		return sum;
	}
	
	private void exceptionalInput(String[] digits) throws Exception
	{
		for(String value:digits)
		{
			if (stringToInt(value)<0)
			{
				throw new Exception("negatives not allowed");
			}
		}
	}
	
	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
}
