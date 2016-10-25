public class Calculations {

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
}
