import java.util.Arrays;
import java.util.List;

public class CollAsList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] data = {
				"バラ", "ひまわり", "あさがお"
		};
		List<String> list = Arrays.asList(data);
		list.set(0, "チューリップ");
		System.out.println(list);
		System.out.println(Arrays.toString(data));
 
	}

}
