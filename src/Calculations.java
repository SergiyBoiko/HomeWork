public class Calculations {
	private static int amountOfCharacters;
	private static String resultIs;
	private static int counter;
	private static String resultLine;

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
		resultLine = "";
		while(array.length>1){
			amountOfCharacters = sumArrayChar(array);
			final String result = counter+"st round of calculation, sum is "+amountOfCharacters;
			resultLine = resultLine + result+"\n";
			System.out.println(result);
			String tmp = Integer.toString(amountOfCharacters);
			array = tmp.toCharArray();
			counter++;
		}	
		switch(amountOfCharacters){
		case 1: resultIs = "Final result is One";
		System.out.println("Final result is One");
		break;
		case 2: resultIs = "Final result is Two";
		System.out.println("Final result is Two");
		break;
		case 3: resultIs = "Final result is Three";
		System.out.println("Final result is Three");
		break;
		case 4: resultIs = "Final result is Four";
		System.out.println("Final result is Four");
		break;
		default: resultIs = "Result as a digit";
		System.out.println("Result as a digit");
		}

		return resultLine+resultIs;
	}
}
