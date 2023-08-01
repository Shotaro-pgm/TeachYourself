import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetBasic {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		Set<Integer> hs = new HashSet<>(Arrays.asList(1, 20, 30, 10, 30, 60, 15));
		Set<Integer> hs2 = new HashSet<>(Arrays.asList(10, 20, 99));
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(1));
		System.out.println(hs.containsAll(hs2));
		System.out.println(hs.remove(1));
		System.out.println(hs);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		hs.addAll(hs2);
		System.out.println(hs);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		hs.retainAll(hs2);
		System.out.println(hs);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		Set<Integer> hs3 = new HashSet<>(Arrays.asList(1, 10, 20));
		hs.removeAll(hs3);
		System.out.println(hs);
		System.out.println("------------------------------");

	}

}
