import java.util.Arrays;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1, 20, 30, 10, 60, 15));
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.ceiling(15));
		System.out.println(ts.lower(15));
		System.out.println(ts.tailSet(15));
		System.out.println(ts.headSet(30, true));
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");

	}

}
