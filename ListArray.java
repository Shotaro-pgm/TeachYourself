import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 30, 60));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 5, 3, 6));
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
		
		for(Integer i : list) {
			System.out.println(i / 5);
		}
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.contains(30));
		System.out.println(list.indexOf(30));
		System.out.println(list.lastIndexOf(30));
		System.out.println(list.isEmpty());
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		list.addAll(list2);
		System.out.println(list);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		list.removeAll(list3);
		System.out.println(list);
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		list.set(0, 100);
		var data = list.toArray();
		System.out.println(Arrays.toString(data));
		System.out.println("------------------------------");
	}

}
