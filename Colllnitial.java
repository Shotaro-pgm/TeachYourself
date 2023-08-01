import java.util.ArrayList;
import java.util.List;

public class Colllnitial {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> data = new ArrayList<>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		for(String list: data) {
			System.out.println(list);
		}

	}

}
