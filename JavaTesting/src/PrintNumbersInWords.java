import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintNumbersInWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		new PrintNumbersInWords().setValues(map);
		Integer val = in.nextInt();
		Integer temp = val;
		int sum = 0;
		String str = "";
		int length = String.valueOf(temp).length();
		int count = 0;
		if (temp >= 20) {
			while (count < length) {
				int remainder = temp % 10;
				System.out.println(remainder);
				int p = (int) Math.pow(10, count) * remainder;
				str = map.get(p) + str;
				temp = temp / 10;
				count++;
			}
		} else {
			str = map.get(temp);
		}

		System.out.println(str);
	}

	public void setValues(Map<Integer, String> hashmap) {
		hashmap.put(1, "one");
		hashmap.put(2, "two");
		hashmap.put(3, "three");
		hashmap.put(4, "four");
		hashmap.put(5, "five");
		hashmap.put(6, "six");
		hashmap.put(7, "seven");
		hashmap.put(8, "eight");
		hashmap.put(9, "nine");
		hashmap.put(10, "ten");
		hashmap.put(11, "eleven");
		hashmap.put(12, "twelve");
		hashmap.put(13, "thirteen");
		hashmap.put(14, "fourteen");
		hashmap.put(15, "quarter");
		hashmap.put(16, "sixteen");
		hashmap.put(17, "seventeen");
		hashmap.put(18, "eighteen");
		hashmap.put(19, "nineteen");
		hashmap.put(20, "twenty");
		hashmap.put(30, "thirty");
		hashmap.put(40, "fourty");
		hashmap.put(50, "fifty");
		hashmap.put(60, "Sixty");
		hashmap.put(70, "Seventy");
		hashmap.put(80, "Eighty");
		hashmap.put(90, "Ninety");
		hashmap.put(100, "One Hundred and");
		hashmap.put(200, "two Hundred and");
		hashmap.put(300, "Three Hundred and");
		hashmap.put(400, "Four Hundred and");
		hashmap.put(500, "Five Hundred and");
		hashmap.put(600, "Six Hundred and");
		hashmap.put(700, "Seven Hundred and");
		hashmap.put(800, "Eight Hundred and");
		hashmap.put(900, "Nine Hundred and");
	}

}
