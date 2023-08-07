import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegAfter {

	public static void main(String[] args) {
		String str = "<p>サポートサイト<a href=\"https://www.wings.msn.to/\">https://www.wings.msn.to/</a></p>";
		Pattern ptn = Pattern.compile("<a href=\"(?<link>.+?)\">\\k<link></a>");
		Matcher match = ptn.matcher(str);
		if(match.find()) {
			System.out.println(match.group());
		}

	}

}
