
public class BreakNest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				if(result > 50) {
					break;
				}
				System.out.printf("%2d", result);
			}
			System.out.println();
		}
	}

}
