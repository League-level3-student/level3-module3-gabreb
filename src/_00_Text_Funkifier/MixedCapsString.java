package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String k = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				k += Character.toLowerCase(s.charAt(i));
			}
			else {
				k += Character.toUpperCase(s.charAt(i));
			}
		}
		return k;
	}

}
