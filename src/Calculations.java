public class Calculations {

	private static String resultLine;
	private static int amountOfCharacters;
	private static int counter;

	private static String withOffPlus(String text){
		String str = text.replaceAll("[-+)(]","");
		return str;

	}
	
	private static int sumArrayChar(char [] array){
		int sum = 0;
		for( final char c : array){
			sum += Character.getNumericValue ( c );
		}
		return sum;

	}
	
	public static String calculationCharNumber(String text){
		final String line = withOffPlus(text);
		char [] array = line.toCharArray ();
		counter = 1;
		while(array.length>1){
			amountOfCharacters = sumArrayChar(array);
			resultLine = counter+"st round of calculation, sum is "+amountOfCharacters;
			System.out.println(resultLine);
			String tmp = Integer.toString(amountOfCharacters);
			array = tmp.toCharArray();
			counter++;
		}
		return text;

	}
}
