public class Calculations {

	private static String withOffPlus(String text){
		String str = text.replaceAll("[-+)(]","");
		return str;

	}
}
