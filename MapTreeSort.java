import java.util.Map;
import java.util.TreeMap;

public class MapTreeSort {

	public static void main(String[] args) {
		Map<String, String> data = new TreeMap<>((x, y) -> x.length() - y.length());
		
		data.put("Rose", "バラ");
		data.put("Sunflower", "ひまわり");
		data.put("Morning Glory", "あさがお");
		System.out.println(data); 

	}

}
