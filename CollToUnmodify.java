import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollToUnmodify {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>(Arrays.asList("バラ", "ひまわり", "あさがお"));
		List<String> udata = Collections.unmodifiableList(data);
		udata.set(0, "チューリップ");
		udata.add("さくら");

	}

}
