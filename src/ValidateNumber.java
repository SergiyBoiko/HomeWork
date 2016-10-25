public class ValidateNumber {

	public static boolean checkPhoneNumber(String telNumber) {
		final String str = telNumber.replaceAll("[-+)(]","");
		if(str.matches("^(\\d+)$")) {
			if (str.length() < 10 ) {
				System.out.println("Phone number short "+telNumber);
				return false;
			}
			if(str.length() > 14){
				System.out.println("Phone number long "+telNumber);
				return  false;
			}
		}
		return false;

	}
}
