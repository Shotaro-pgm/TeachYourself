import java.util.Arrays;

public class CompareArrayMethod {

	public static void main(String[] args) {
		int[] data1 = {1, 3};
		int[] data2 = {1, 2, 3};
		int[] data3 = {1, 2, 3};
		int[] data4 = {1, 3, 1};
		System.out.println(Arrays.compare(data1, data2));
		System.out.println(Arrays.compare(data3, data4));
		System.out.println(Arrays.compare(data2, data3));

	}

}
