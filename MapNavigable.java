import java.util.TreeMap;

public class MapNavigable {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>() {
			{
				put("peak", "高くなる");
				put("peach", "もも");
				put("peace", "一切れ");
				put("piece", "平和");
			}
		};
		
		String key = "pear";
		
		if(data.containsKey(key)) {
			System.out.println(key + "は" + data.get(key) + "です。");
		} else {
			System.out.println("検索中の単語は");
			System.out.println(data.lowerKey(key) + "または");
			System.out.println(data.higherKey(key));
			System.out.println("ですか？");
		}

	}

}
