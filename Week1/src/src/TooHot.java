package src;

public class TooHot {
	
	
	public static void main(String[] args)
	{

		System.out.println(tooHot(true, 88));
		System.out.println(tooHot(false, 23));
		System.out.println(tooHot(true, 42));
		System.out.println(tooHot(false, 65));

	}

	
	
	public static String tooHot(boolean isSummer, int temperature) {
		String t = "True";
		String f = "False";
		if (isSummer == true) {
			if (temperature >= 60 && temperature <= 100) {
			return t;
		}
			else {
				return f;
				}
			}
		else if (isSummer == false) {
			if(temperature >= 60 && temperature <= 90) {
				return t;
			}
			else {
				return f;
			}
		}
		return null;
			}
	
}
