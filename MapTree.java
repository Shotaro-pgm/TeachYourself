import java.util.Map;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		Map<String, String> data = new TreeMap<>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
		for(String key : data.keySet()) {
			System.out.println(key);
		}

	}

}
