
public class StringCalculator {

	
	private final String delimeter=",|\n";
	
	public int add(String input)
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
			return getAddition(digits[0],digits[1]);
		}
	}
	
	private int getAddition(String na,String nb)
	{
		return Integer.parseInt(na)+Integer.parseInt(nb);
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
