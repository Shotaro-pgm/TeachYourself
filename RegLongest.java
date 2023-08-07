import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegLongest {

	public static void main(String[] args) {
		String tags = "<p><strong>WINGS</strong>サイト<a href='index.html'><img src='wings.jpg></p>";
		Pattern ptn = Pattern.compile("<.+?>");
		Matcher match = ptn.matcher(tags);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
