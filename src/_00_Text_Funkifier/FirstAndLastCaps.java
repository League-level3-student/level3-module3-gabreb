package _00_Text_Funkifier;

public class FirstAndLastCaps extends SpecialString {

	public FirstAndLastCaps(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		/* String k = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i + 1) == ' ') {
				k += Character.toUpperCase(s.charAt(i));
			} else if (s.charAt(i - 1) == ' ' && i > 0) {
				k += Character.toUpperCase(s.charAt(i));
			} 
			else {
				k += s.charAt(i);
			}
		}
*/
		String k = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i+1)==' ') {
				k+= Character.toUpperCase(s.charAt(i));
				k+= " ";
				k+= Character.toUpperCase(s.charAt(i+2));
				i += 2;
			}
			else if (s.charAt(i) == ' ') {
				k+=" ";
				k+= Character.toUpperCase(s.charAt(i+1));
				i+=1;
			}
			else {
				k+=s.charAt(i);
			}
		}
		return k;
	}

}
