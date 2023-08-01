
public class ConcatBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 100000; i++) {
			builder.append("いろは");
		}
		String result = builder.toString();
		System.out.println(result);
	}

}
