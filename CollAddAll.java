import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollAddAll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] data = {
				"バラ", "ひまわり", "あさがお"
		};
		List<String> list = new ArrayList<>();
		Collections.addAll(list, data);
		list.set(0, "チューリップ");
		list.add("さくら");
		list.remove(1);
		
		System.out.println(list);
		System.out.println(Arrays.toString(data));

	}

}
