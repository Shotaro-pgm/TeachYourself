
public class StrSplit {

	public static void main(String[] args) {
		String str1 = "うめ, もも, さくら";
		String[] result1 = str1.split(",");
		System.out.println(String.join("&", result1));
		
		String str2 = "うめ, もも, さくらとあんず";
		String[] result2 = str2.split("[,と]");
		System.out.println(String.join("&", result2));
		
		String str3 = "うめ, もも, さくら";
		String[] result3 = str3.split("");
		System.out.println(String.join("&", result3));
		
		String str4 = "うめ, もも, さくら, あんず";
		String[] result4 = str4.split(",", 3);
		System.out.println(String.join("&", result4));

	}

}
