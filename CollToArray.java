import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollToArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> data = new ArrayList<>(Arrays.asList("バラ", "ひまわり", "あさがお"));
		String[] strs = new String[data.size()];
		data.toArray(strs);
		data.set(0, "チューリップ");
		
		System.out.println(Arrays.toString(strs));
		System.out.println(data);

	}

}
