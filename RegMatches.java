import java.util.regex.Pattern;

public class RegMatches {

	public static void main(String[] args) {
		String[] tel = {"080-0000-0000", "084-0000-0000", "184-0000"};
		String rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
		for(String t : tel) {
			System.out.println(Pattern.matches(rx, t) ? t : "アンマッチ");
		}

	}

}
