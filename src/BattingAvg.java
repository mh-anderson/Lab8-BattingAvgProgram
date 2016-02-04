import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat decFormat = new DecimalFormat("0.000");

		System.out.println(
				"HEY! Let's crunch some batting averages and slugging percetages!\n\n\t\t\tBY: MATT ANDERSON\n\n");
		System.out.print(
				"Tell me how many times that this hypothetical batter is\ngoing up to bat.\n\nNUMBER OF BATTING ATTEMPTS: ");
		int numOfBats = scan.nextInt();
		System.out.println();
		int[] array = new int[numOfBats];
		// BigDecimal input = new BigDecimal(Double.toString(numOfBats));

		for (int i = 0; i < array.length; i++) {
			System.out.print("How many bases did they get for round #" + (i + 1)
					+ "? \nPLEASE ENTER A NUMBER BETWEEN 0 AND 4: ");
			array[i] = scan.nextInt();
			System.out.println();
		}
		int sum = 0;

		for (int i = 0; i < array.length; i++)
			sum = sum + array[i];

		// calculate average value
		int average = sum / array.length;
		double thisSucks = average;

		System.out.println("SLUGGING PERCENT : " + decFormat.format(thisSucks));
		int percent = sum / array.length;
		int answer = percent * 100;
		System.out.println("BATTING AVG: " + answer);
	}

	public static void printArraySlugPercent(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void printArrayBatAvg(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}