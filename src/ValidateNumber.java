
public class ValidateNumber {
	public static boolean checkPhoneNumber(String telNumber) {
		final String str = telNumber.replaceAll("[-+)(]","");//проверка на наличия знака
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
		if(telNumber.matches("^(\\+|00)380(50|95|99|67|96|97|98|63|93|68|92|94|39)[\\d]{7}$") 
				|| telNumber.matches("^0(50|95|99|67|96|97|98|63|93|68|92|94|39)[\\d]{7}$")){	
		System.out.println("Phone number correct "+telNumber);
			return true;
		}
		System.out.println("Phone number incorrect "+telNumber);
		return false;
	}
}
