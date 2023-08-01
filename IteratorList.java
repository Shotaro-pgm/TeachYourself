import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> data = new ArrayList<>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		ListIterator<String> iter = data.listIterator(data.size());
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}

	}

}
