import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegMulti {

	public static void main(String[] args) {
		String str = "10人のインディアン。\n1年生になったら";
		Pattern ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);
		Matcher match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
