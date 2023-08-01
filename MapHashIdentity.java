import java.util.HashMap;
import java.util.Map;

public class MapHashIdentity {

	public static void main(String[] args) {
		Integer key1 = Integer.valueOf(256);
		Integer key2 = Integer.valueOf(256);
		
		Map<Integer, String> data = new HashMap<>() {
			{
				put(key1, "Hoge");
				put(key2, "Foo");
			}
			
		};
		System.out.println(data);

	}

}
