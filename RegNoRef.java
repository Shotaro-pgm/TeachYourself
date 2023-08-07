import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegNoRef {

	public static void main(String[] args) {
		String str = "仕事はwings@example.comです。プライベート用はYAMA@example.comです。";
		Pattern ptn = Pattern.compile("([a-z0-9.!#$%&'*+/=?^_{|}~-]+)@([a-z0-9-]+(\\.[a-z0-9-]+)*)", Pattern.CASE_INSENSITIVE);
		Matcher match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
			System.out.println(match.group(1));
			System.out.println(match.group(2));
			System.out.println(match.group(3));
			System.out.println("----");
		}

	}

}
