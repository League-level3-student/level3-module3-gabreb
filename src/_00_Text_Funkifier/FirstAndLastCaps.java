package _00_Text_Funkifier;

public class FirstAndLastCaps extends SpecialString{

	public FirstAndLastCaps(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				Character.toUpperCase(s.charAt(i-1));
				Character.toUpperCase(s.charAt(i+1));
			}
		}
		return s;
	}
	
	

}
