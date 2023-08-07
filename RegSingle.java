import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegSingle {

	public static void main(String[] args) {
		String str = "初めまして。\nよろしくお願いします。";
		Pattern ptn = Pattern.compile("^.+", Pattern.DOTALL);
		Matcher match = ptn.matcher(str);
		while(match.find()) {
			System.out.println(match.group());
		}

	}

}
