
public class AutoBoxing {

	public static void main(String[] args) {
		Long result = 0L;
		
		for(int i = 0; i < 10000; i++) {
			result += 1;
		}
		
		System.out.println(result);

	}

}
