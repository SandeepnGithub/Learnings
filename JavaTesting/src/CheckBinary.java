import java.util.Scanner;

public class CheckBinary {

	/**
	 * check with 1000111 Binary and 1000113 not Binary
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer val = in.nextInt();
		Integer temp = val;
		Boolean status = true;
		while (temp > 0) {
			Integer remainder = temp % 10;
			if (remainder > 1) {
				status = false;
				break;
			}
			temp = temp / 10;
		}
		if (status)
			System.out.println("BINARY");
		else
			System.out.println("NOT BINARY");
	}

}
