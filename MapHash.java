import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapHash {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
		System.out.println(map.containsKey("Rose"));
		System.out.println(map.containsValue("Rose"));
		System.out.println(map.isEmpty());
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		map.replace("Rose", "薔薇");
		map.replace("Sunflower", "ひまわり", "向日葵");
		
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
