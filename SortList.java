import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		String[] data = {
				"バラ", "ひまわり", "チューリップ", "さくら"
		};
		Arrays.sort(data, (x, y) -> x.length() - y.length());
		System.out.println(Arrays.toString(data));
		List<String> list = new ArrayList<>(Arrays.asList("バラ", "ひまわり", "チューリップ", "さくら"));
		list.sort((x, y) -> x.length() - y.length());
		System.out.println(list);

	}

}
