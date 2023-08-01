import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> data = new ArrayList<>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		
		Iterator<String> iter = data.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
		}
		System.out.println(data);

	}

}
