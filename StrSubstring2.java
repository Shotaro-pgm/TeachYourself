
public class StrSubstring2 {

	public static void main(String[] args) {
		String mail = "yamada@example.com";
		System.out.println(mail.substring(mail.lastIndexOf("@") + 1));
		System.out.println(mail.charAt(0));
		for(int i = 0; i < mail.length(); i++) {
			System.out.println(mail.charAt(i));
		}

	}

}
