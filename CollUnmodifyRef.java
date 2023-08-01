import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollUnmodifyRef {

	public static void main(String[] args) {
		List<StringBuilder> data = new ArrayList<>(Arrays.asList(
				new StringBuilder("ひふみ"),
				new StringBuilder("よいむ"),
				new StringBuilder("なやこ")
		));
		List<StringBuilder> udata = Collections.unmodifiableList(data);
		udata.get(0).append("いちにさん");
		System.out.println(udata);
	}

}
